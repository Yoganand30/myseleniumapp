package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Automated login to SauceDemo website using Selenium WebDriver
 */
public class App {
    public static void main(String[] args) {
        // Set up the ChromeDriver (ensure it's in your PATH or specify the full path)
        WebDriver driver = new ChromeDriver();

        // Open the SauceDemo website
        driver.get("https://www.saucedemo.com/");
        
        // Maximize the browser window
        driver.manage().window().maximize();

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click the login button
        driver.findElement(By.id("login-button")).click();
        
        // Close the browser after the operation
        driver.quit();
    }
}

