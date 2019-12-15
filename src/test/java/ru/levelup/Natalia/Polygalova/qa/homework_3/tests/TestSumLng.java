package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSumLng extends AbstractClass{


    @DataProvider
    public Object [][] SumLongPositiveTestDataProvider(){
        return new Object[][]{
                {10L,10L,20L},
                {-4L,-6L,-10L},
                {5432L, 1L,5433L}
        };
    }
    @Test(dataProvider = "SumLongPositiveTestDataProvider")
    public void DataProviderPositiveTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        long actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] SumLongNegativeTestDataProvider(){
        return new Object[][]{
                {-1L,0L,1L},
                {11L,0L,22L},
                {20L, 54L,1L}
        };
    }
    @Test(dataProvider = "SumLongNegativeTestDataProvider")
    public void DataProviderNegativeTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        long actual = calculator.sum(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
