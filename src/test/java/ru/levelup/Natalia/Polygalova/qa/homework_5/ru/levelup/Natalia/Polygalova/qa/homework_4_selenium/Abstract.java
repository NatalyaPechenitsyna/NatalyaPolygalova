package ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_4_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;



public class Abstract {

    protected WebDriver driver;


    @BeforeSuite
    public void setUpSuite(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUpTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
    @AfterMethod
    public void tearDownBrowser() {
        driver.quit();
    }

}