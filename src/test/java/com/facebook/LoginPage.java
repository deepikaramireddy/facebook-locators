package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Applied methods of WebDriver and WebElement on LoginPage
public class LoginPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        driver.manage().window().maximize();
        System.out.println("The title of the page "+driver.getTitle());

        System.out.println("The current page URL "+driver.getCurrentUrl());

        System.out.println("The page source URL "+driver.getPageSource());

        WebElement emailId=driver.findElement(By.id("email"));
        System.out.println("Getting tag name for email component: "+emailId.getTagName());
        System.out.println("Getting Location for email component: "+emailId.getLocation());
        System.out.println("Getting size for email component: "+emailId.getSize());
        emailId.sendKeys("9030905828");
        System.out.println("Getting attribute name for email component: "+emailId.getAttribute("type"));
        System.out.println("Getting text for email component: "+emailId.getText());
        Thread.sleep(1000);

        WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("Deepa@111");
        Thread.sleep(2000);

        WebElement login= driver.findElement(By.name("login"));
        System.out.println("Getting css value "+login.getCssValue("color"));
        login.click();

        driver.navigate().to("https://www.facebook.com/?sk=welcome");
        Thread.sleep(1000);

        driver.navigate().to("https://www.facebook.com/friends");
        driver.quit();
    }
}
