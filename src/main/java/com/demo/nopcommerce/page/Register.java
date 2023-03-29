package com.demo.nopcommerce.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Register {

  WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        System.out.println("Open Browser");
        System.setProperty("webdriver.edge.driver", "/Users/binjalraval/Downloads/driver/msedgedriver");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }

    @Test(priority = 2)
    void registerUser() {
        System.out.println("Register");

        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.xpath("//*[@id=\"gender\"]/span[2]/label")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Binjal");
        driver.findElement(By.id("LastName")).sendKeys("Raval");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("20");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("September");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1999");
        driver.findElement(By.id("Email")).sendKeys("bvs.aval30@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("UnifyTesting");
        driver.findElement(By.id("Password")).sendKeys("Testing2023");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Testing2023");
        driver.findElement(By.id("register-button")).click();
    }

}
