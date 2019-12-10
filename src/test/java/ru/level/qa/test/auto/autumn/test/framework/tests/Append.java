package ru.level.qa.test.auto.autumn.test.framework.tests;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Program;
import ru.levelup.Natalia.Polygalova.qa.homework_1.task_1.Addition;

public class Append{

    private Addition addition;


    @BeforeMethod
    public void Appl(){
        System.out.println("=====Before Method=====");
        addition  = new Addition();
    }

    @DataProvider
    public Object [][] AppendPositiveTestDataProvider(){
        return new Object[][]{
                {15.3,17.7,33},
                {-1,-28.5,-29.5},
                {997, 3,1000}
        };
    }
    @Test(dataProvider = "AppendPositiveTestDataProvider")
    public void dataProviderAppendPositiveTest(double num1, double num2, double expected){
       System.out.println(this.getClass().getName());
        double actual = addition.addit(num1, num2);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] AppendNegativeTestDataProvider(){
        return new Object[][]{
                {-1,40.5,111},
                {11,0,22},
                {20, 54,1}
        };
    }
    @Test(dataProvider = "AppendNegativeTestDataProvider")
    public void dataProviderAppendNegativeTest(double num1, double num2, double expected){
        System.out.println(this.getClass().getName());
        double actual = addition.addit(num1, num2);
        Assert.assertNotEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("=====After Method=====");
        addition  = null;
    }

}
