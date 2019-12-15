package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSubLng extends AbstractClass{

    @DataProvider
    public Object [][] SubLongPositiveTestDataProvider(){
        return new Object[][]{
                {98765L,12345L,86420L},
                {-101L,205L,-306L},
                {57L, 7L,50L}
        };
    }
    @Test(dataProvider = "SubLongPositiveTestDataProvider")
    public void DataProviderPositiveTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] SubLongNegativeTestDataProvider(){
        return new Object[][]{
                {-1L,405L,111L},
                {11L,0L,22L},
                {20L, 54L,1L}
        };
    }
    @Test(dataProvider = "SubLongNegativeTestDataProvider")
    public void DataProviderNegativeTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.sub(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}