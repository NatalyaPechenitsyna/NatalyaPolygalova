package ru.level.qa.test.auto.autumn.test.framework.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Program;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Subtraction;

public class Deduct {

    private Subtraction subtraction;

    @BeforeMethod
    public void Appl(){
        System.out.println("=====Before Method=====");
        subtraction  = new Subtraction();
    }
    @DataProvider
    public Object [][] DeductPositiveTestDataProvider(){
        return new Object[][]{
                {40,2,38},
                {-4.2,37,-41.2},
                {1.5, 87.5,-86}
        };
    }
    @Test(dataProvider = "DeductPositiveTestDataProvider")
    public void dataProviderAppendPositiveTest(double num1, double num2, double expected){
        System.out.println(this.getClass().getName());
        double actual = subtraction.subtr(num1, num2);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] DeductNegativeTestDataProvider(){
        return new Object[][]{
                {-5,40.5,111},
                {11,22,22},
                {-1000, 54,1}
        };
    }
    @Test(dataProvider = "DeductNegativeTestDataProvider")
    public void dataProviderAppendNegativeTest(double num1, double num2, double expected){
        System.out.println(this.getClass().getName());
        double actual = subtraction.subtr(num1, num2);
        Assert.assertNotEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("=====After Method=====");
        subtraction  = null;
    }
}
