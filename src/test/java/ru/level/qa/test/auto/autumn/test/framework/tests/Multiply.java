package ru.level.qa.test.auto.autumn.test.framework.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Program;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Multiplication;


public class Multiply {


    private Multiplication multiplication;


    @BeforeMethod
    public void Appl() {
        System.out.println("=====Before Method=====");
        multiplication = new Multiplication();
    }

    @DataProvider
    public Object [][] MultiplyPositiveTestDataProvider(){
        return new Object[][]{
                {40,2,80},
                {-4.2,37,-155.4},
                {1.5, 87.5,131.25}
        };
    }
     @Test(dataProvider = "MultiplyPositiveTestDataProvider")
   public void dataProviderMultiplyPositiveTest(double num1, double num2, double expected){
         System.out.println(this.getClass().getName());
         double actual = multiplication.multip(num1, num2);
         Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] MultiplyNegativeTestDataProvider(){
        return new Object[][]{
                {-5,40.5,111},
                {11,22,22},
                {-1000, 54,1}
        };
    }
    @Test(dataProvider = "MultiplyNegativeTestDataProvider")
    public void dataProviderMultiplyNegativeTest(double num1, double num2, double expected) {
        System.out.println(this.getClass().getName());
        double actual = multiplication.multip(num1, num2);
        Assert.assertNotEquals(actual, expected);
    }


    @AfterMethod
    public void tearDown(){
        System.out.println("=====After Method=====");
        multiplication  = null;
    }

}
