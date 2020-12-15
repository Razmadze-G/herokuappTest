package com.herokuapp.tests;

import com.herokuapp.pages.ChallengingDOM_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChallengingDOM_Test {
    @Test
    void CheckTableRow() {
        System.setProperty("webdriver.chrome.driver", "/home/ramzo/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com");

        ChallengingDOM_Page CheckTable = new ChallengingDOM_Page(driver);
        CheckTable.navigateToCallengingDOM();
        CheckTable.checkFirstRowOfTheTable();

        driver.quit();
    }
}