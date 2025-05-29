package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Automating the Registration page using selenium WebDriver
public class RegistrationPage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement firstName= driver.findElement(By.name("firstname"));
        firstName.sendKeys("Nick");
        Thread.sleep(1000);

        WebElement surname= driver.findElement(By.name("lastname"));
        surname.sendKeys("Joe");
        Thread.sleep(1000);

        WebElement dateComponent= driver.findElement(By.id("day"));
        boolean date= dateComponent.isDisplayed();
        if(date==true){
            Select dateSelect=new Select(dateComponent);
            dateSelect.selectByValue("7");
        }
        else{
            System.out.println("Date dropdown is not displayed");
        }
        Thread.sleep(1000);

        WebElement monthComponent= driver.findElement(By.id("month"));
        boolean month= monthComponent.isDisplayed();
        if (month==true){
            Select monthSelect=new Select(monthComponent);
            monthSelect.selectByVisibleText("Jun");
        }
        else{
            System.out.println("Month dropdown is not displayed");
        }
        Thread.sleep(1000);

        WebElement yearComponent= driver.findElement(By.id("year"));
        if (yearComponent.isDisplayed()){
           Select yearSelect=new Select(yearComponent);
           yearSelect.selectByVisibleText("2002");
        }
        else{
            System.out.println("Year dropdown is not displayed");
        }
        Thread.sleep(1000);

        WebElement maleRadio = driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
        if (!maleRadio.isSelected()) {
            maleRadio.click();
        } else {
            System.out.println("Male radio button is already selected.");
        }
        Thread.sleep(1000);

        WebElement email= driver.findElement(By.name("reg_email__"));
        if(email.isEnabled()) {
            email.sendKeys("ramireddydeepika@gmail.com");
        }
        else {
            System.out.println("Email component is not enabled");
        }
        Thread.sleep(1000);

        WebElement newPassword= driver.findElement(By.name("reg_passwd__"));
        if(newPassword.isEnabled()){
            newPassword.sendKeys("NickJoe");
        }
        else{
            System.out.println("New Password component is not enabling");
        }
        Thread.sleep(1000);

        WebElement signUp= driver.findElement(By.name("websubmit"));
        if (signUp.isEnabled()){
            System.out.println("Sign Up component is working fine");
        }
        else {
            System.out.println("Sign Up component is not enabling");
        }

        driver.quit();
    }
}
