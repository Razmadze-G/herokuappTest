package com.herokuapp.tests;

import com.herokuapp.pages.ShiftingContent_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShiftingContent_Test {
    WebDriver driver;

    @BeforeMethod
    void BeforeContentShift(){
        System.setProperty("webdriver.chrome.driver", "/home/ramzo/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");
    }

    @Test
    void ContentShift() {
        ShiftingContent_Page Shifting = new ShiftingContent_Page(driver);
        Shifting.navigateToShiftingContent();
        Shifting.CheckIfHomeButtonStyleChanges();
        Shifting.CheckImageOnButtonClick();
        driver.quit();
    }
}