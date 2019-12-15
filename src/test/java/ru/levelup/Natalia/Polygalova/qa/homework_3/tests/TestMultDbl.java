package ru.levelup.Natalia.Polygalova.qa.homework_3.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestMultDbl extends AbstractClass{

    @DataProvider
    public Object [][] MultDoublePositiveTestDataProvider(){
        return new Object[][]{
                {124,2,248},
                {-10.5,-10.5,110},
                {1020, 0.4,408}
        };
    }
    @Test(dataProvider = "MultDoublePositiveTestDataProvider")
    public void DataProviderPositiveTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.mult(a, b);
        Assert.assertEquals(actual, expected);
    }


    @DataProvider
    public Object [][] MultDoubleNegativeTestDataProvider(){
        return new Object[][]{
                {0,1,1},
                {-2,-222,-444},
                {28, 28,56}
        };
    }
    @Test(dataProvider = "MultDoubleNegativeTestDataProvider")
    public void DataProviderNegativeTest(double a, double b, double expected){
        System.out.println(this.getClass().getName());
        double actual = calculator.mult(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}