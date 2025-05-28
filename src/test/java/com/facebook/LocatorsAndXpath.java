package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class LocatorsAndXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");

//        WebElement emailById = driver.findElement(By.id("email"));
//        emailById.sendKeys("ramireddydeepika@gmail.com");
//        Thread.sleep(1000);
//
//        WebElement emailByName = driver.findElement(By.name("email"));
//        emailByName.clear();
//        emailByName.sendKeys("9030905828");
//        Thread.sleep(1000);
//
//        WebElement passwordById = driver.findElement(By.id("pass"));
//        passwordById.sendKeys("Deepa@111");
//        Thread.sleep(1000);
//
//        WebElement firstInput = driver.findElement(By.tagName("input"));
//        System.out.println("First input tag: " + firstInput.getDomAttribute("name"));
//
//        WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
//        System.out.println("Link Text: " + forgottenPassword.getText());
//
//        WebElement partialLink = driver.findElement(By.partialLinkText("Forgotten"));
//        System.out.println("Partial Link Text: " + partialLink.getText());
//
//        WebElement loginButtonByCss = driver.findElement(By.cssSelector("button[name='login']"));
//        loginButtonByCss.click();
//        Thread.sleep(1000);

        WebElement emailByXpath = driver.findElement(By.xpath("//input[@id='email']"));
        emailByXpath.clear();
        emailByXpath.sendKeys("ramireddydeepika@gmail.com");

        // Clearing before sending keys again to avoid concatenation
        emailByXpath.clear();
        emailByXpath.sendKeys("9030905828");
        Thread.sleep(1000);

        WebElement passwordInput = driver.findElement(By.xpath("//input[contains(@name, 'pass')]"));
        passwordInput.sendKeys("Deepa@111");
        Thread.sleep(1000);

        WebElement loginButton = driver.findElement(By.xpath("//button[starts-with(@name, 'log')]"));
        loginButton.click();
        Thread.sleep(1000);

        WebElement forgottenLinkExact = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
        System.out.println("Exact link text: " + forgottenLinkExact.getText());

        WebElement forgottenLinkPartial = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten')]"));
        System.out.println("Partial link text: " + forgottenLinkPartial.getText());

        WebElement emailInputMultiple = driver.findElement(By.xpath("//input[@type='text' and @id='email']"));
        emailInputMultiple.clear();
        emailInputMultiple.sendKeys("9030905828");
        Thread.sleep(1000);

        WebElement lastInput = driver.findElement(By.xpath("(//input)[last()]"));
        System.out.println("Last input tag name: " + lastInput.getTagName());

        driver.quit();
    }
}