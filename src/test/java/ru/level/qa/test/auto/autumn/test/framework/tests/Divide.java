package ru.level.qa.test.auto.autumn.test.framework.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Program;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Division;

public class Divide {

    private Division division;

    @BeforeMethod
    public void Appl() {
        System.out.println("=====Before Method=====");
        division = new Division();
    }

    @DataProvider
    public Object [][] DividePositiveTestDataProvider(){
        return new Object[][]{
                {72,4,18},
                {-1874.5,23,-81.5},
                {242, 11,22}
        };
    }
    @Test(dataProvider = "DividePositiveTestDataProvider")
    public void dataProviderMultiplyPositiveTest(double num1, double num2, double expected){
        System.out.println(this.getClass().getName());
        double actual = division.divis(num1, num2);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] DivideNegativeTestDataProvider(){
        return new Object[][]{
                {-23,60.5,111},
                {11,18,5},
                {-10.3, 54,1}
        };
    }
    @Test(dataProvider = "DivideNegativeTestDataProvider")
    public void dataProviderDivideNegativeTest(double num1, double num2, double expected) {
        System.out.println(this.getClass().getName());
        double actual = division.divis(num1, num2);
        Assert.assertNotEquals(actual, expected);
    }
        @AfterMethod
        public void tearDown(){
            System.out.println("=====After Method=====");
            division  = null;
    }
}
