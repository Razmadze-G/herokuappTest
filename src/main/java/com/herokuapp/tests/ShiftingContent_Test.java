package com.herokuapp.tests;

import com.herokuapp.pages.ShiftingContent_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShiftingContent_Test {
    @Test
    void ContentShift() {
        System.setProperty("webdriver.chrome.driver", "/home/ramzo/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");

        ShiftingContent_Page Shifting = new ShiftingContent_Page(driver);
        Shifting.navigateToShiftingContent();
        Shifting.CheckIfHomeButtonStyleChanges();
        Shifting.CheckImageOnButtonClick();
        driver.quit();
    }
}