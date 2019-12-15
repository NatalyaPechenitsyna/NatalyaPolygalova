package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestSubDbl extends AbstractClass{


    @DataProvider
    public Object [][] SubDblPositiveTestDataProvider(){
        return new Object[][]{
                {15.3,15.3,0},
                {-100,-100.5,0.5},
                {74, 3,71}
        };
    }
    @Test(dataProvider = "SubDblPositiveTestDataProvider")
    public void DataProviderPositiveTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] SubDblNegativeTestDataProvider(){
        return new Object[][]{
                {-1,-30,31},
                {0,5,5},
                {20, 10000,200}
        };
    }
    @Test(dataProvider = "SubDblNegativeTestDataProvider")
    public void DataProviderNegativeTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.sub(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
