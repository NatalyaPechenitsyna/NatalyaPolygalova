package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSumDbl extends AbstractClass {

       @DataProvider
    public Object [][] SumDblPositiveTestDataProvider(){
        return new Object[][]{
                {15.3,17.7,33},
                {-1,-28.5,-29.5},
                {997, 3,1000}
        };
    }
    @Test(dataProvider = "SumDblPositiveTestDataProvider")
    public void DataProviderPositiveTest(double a, double b, double expected){
       System.out.println(this.getClass().getName());
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] SumDblNegativeTestDataProvider(){
        return new Object[][]{
                {-1,40.5,111},
                {11,0,22},
                {20, 54,1}
        };
    }
    @Test(dataProvider = "SumDblNegativeTestDataProvider")
    public void DataProviderNegativeTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.sum(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}

