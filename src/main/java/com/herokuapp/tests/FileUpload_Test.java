package com.herokuapp.tests;

import com.herokuapp.pages.FileUpload_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload_Test {
    WebDriver driver;

    @BeforeMethod
    void BeforeFileUpload(){
        System.setProperty("webdriver.chrome.driver", "/home/ramzo/Documents/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com");
    }

    @Test
    void FileUpload() {
        FileUpload_Page upload = new FileUpload_Page(driver);
        upload.navigateToFileUpload();
        upload.uploadFile();
        upload.checkIfUploaded();

        driver.quit();
    }
}