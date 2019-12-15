package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivLng extends AbstractClass {

    @DataProvider
    public Object [][] DivLongPositiveTestDataProvider(){
        return new Object[][]{
                {182934L,2311L,79L},
                {-1342L,-9090L,0L},
                {997L, 322L,3L}
        };
    }
    @Test(dataProvider = "DivLongPositiveTestDataProvider")
    public void DataProviderPositiveTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] DivLongNegativeTestDataProvider(){
        return new Object[][]{
                {123L,123L,2L},
                {-10L,-1L,-10L},
                {995L, 5L,125L}
        };
    }
    @Test(dataProvider = "DivLongNegativeTestDataProvider")
    public void DataProviderNegativeTest(long a, long b, long expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.div(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}