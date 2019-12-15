package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDivDbl extends AbstractClass{

    @DataProvider
    public Object [][] DivDoublePositiveTestDataProvider(){
        return new Object[][]{
                {253.5,0.5,507},
                {-100,-10,10},
                {22, 4,5.5}
        };
    }
    @Test(dataProvider = "DivDoublePositiveTestDataProvider")
    public void dataProviderPositiveTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.div(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] DivDoubleNegativeTestDataProvider(){
        return new Object[][]{
                {-1000,10,111},
                {118.5,0,1},
                {20, 54,1}
        };
    }
    @Test(dataProvider = "DivDoubleNegativeTestDataProvider")
    public void dataProviderNegativeTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.div(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
