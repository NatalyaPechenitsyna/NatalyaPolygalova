package ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_4_selenium.Ex2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_4_selenium.Abstract;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TestAddTask extends Abstract {


    @Test
    public void AddUser() {

        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("login")).sendKeys("nataly-pechenitsyna@mail.ru");
        driver.findElement(By.name("password")).sendKeys("7536951");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        driver.findElement(By.xpath("//a//span[text()='Задачи']")).click();

        //не работает добавление задачи
        //driver.findElement(By.xpath("//a//span[text()='Добавить задачу']")).click();
        //ввод данных в форму
        //добавление задачи с данными

        assertThat(driver.findElement(By.xpath("//a[@href='/tasks/notify/index.html']")).getText(), equalTo(" 0"));

        driver.findElement(By.id("fat-menu")).click();
        driver.findElement(By.xpath("//a[text()='Выход']")).click();

        driver.close();
    }
}