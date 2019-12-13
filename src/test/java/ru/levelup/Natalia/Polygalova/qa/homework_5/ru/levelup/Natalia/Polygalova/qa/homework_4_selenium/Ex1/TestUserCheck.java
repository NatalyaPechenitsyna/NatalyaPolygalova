package ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_4_selenium.Ex1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_4_selenium.Abstract;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestUserCheck extends Abstract {


    @Test
    public void UserNameCheck() {

        driver.get("http://users.bugred.ru/");
        assertThat(driver.getTitle(), equalTo("Users"));

        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("login")).sendKeys("nataly-pechenitsyna@mail.ru");
        driver.findElement(By.name("password")).sendKeys("7536951");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        assertThat(driver.findElement(By.id("fat-menu")).getText(), equalTo("natalyapol"));

        driver.findElement(By.id("fat-menu")).click();
        driver.findElement(By.xpath("//a[text()='Выход']")).click();

        driver.close();
    }
}


