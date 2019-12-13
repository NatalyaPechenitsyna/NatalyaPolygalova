package ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_5_selenium.Exercise3;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ru.levelup.Natalia.Polygalova.qa.homework_5.ru.levelup.Natalia.Polygalova.qa.homework_5_selenium.Selenium;




public class CheckAddUserTest extends Selenium {

    @Test
    public void AddCompany() {

        driver.get("http://users.bugred.ru/");

        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();

        driver.findElement(By.name("login")).sendKeys("nataly-pechenitsyna@mail.ru");
        driver.findElement(By.name("password")).sendKeys("7536951");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        //не работает сайт с добавлением компании

        driver.findElement(By.xpath("//a//span[text()='Пользователи']")).click();

        driver.findElement(By.xpath("//a[text()='Добавить пользователя']")).click();

        driver.findElement(By.name("noibiz_name")).sendKeys("user123");
        driver.findElement(By.name("noibiz_email")).sendKeys("user123@mail.ru");
        driver.findElement(By.name("noibiz_password")).sendKeys("123321");
        driver.findElement(By.name("noibiz_birthday")).sendKeys("131280");
        driver.findElement(By.name("noibiz_gender")).sendKeys("user123@mail.ru");
        driver.findElement(By.xpath("/html/body/div[3]/form/table/tbody/tr[6]/td[2]/select/option[2]")).click();
        driver.findElement(By.name("noibiz_date_start")).sendKeys("131211");
        driver.findElement(By.name("noibiz_hobby")).sendKeys("swimming");

        driver.findElement(By.name("act_create")).sendKeys("swimming");

       driver.findElement(By.id("fat-menu")).click();
       driver.findElement(By.xpath("//a[text()='Выход']")).click();

        driver.close();
    }
}
