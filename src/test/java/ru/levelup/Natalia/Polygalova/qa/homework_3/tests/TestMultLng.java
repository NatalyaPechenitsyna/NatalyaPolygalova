package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMultLng extends AbstractClass{

    @DataProvider
    public Object [][] MultLongPositiveTestDataProvider(){
        return new Object[][]{
                {102L,20000L,2040000L},
                {-32L,-322L,10304L},
                {2L, 3L,6L}
        };
    }
    @Test(dataProvider = "MultLongPositiveTestDataProvider")
    public void DataProviderPositiveTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] MultLongNegativeTestDataProvider(){
        return new Object[][]{
                {153L,177L,33L},
                {-1L,-285L,295L},
                {997L, 3L,1000L}
        };
    }
    @Test(dataProvider = "MultLongNegativeTestDataProvider")
    public void DataProviderNegativeTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.mult(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}
