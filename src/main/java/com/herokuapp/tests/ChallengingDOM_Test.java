package com.herokuapp.tests;

import com.herokuapp.pages.ChallengingDOM_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChallengingDOM_Test {
    WebDriver driver;

    @BeforeMethod
    void BeforeCheckTableRow(){
        System.setProperty("webdriver.chrome.driver", "/home/ramzo/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com");
    }

    @Test
    void CheckTableRow() {
        ChallengingDOM_Page CheckTable = new ChallengingDOM_Page(driver);
        CheckTable.navigateToCallengingDOM();
        CheckTable.checkFirstRowOfTheTable();

        driver.quit();
    }
}