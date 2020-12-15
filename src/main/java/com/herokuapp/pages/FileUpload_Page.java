package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Page {
    WebDriver driver;

    By navigationLink = new By.ByLinkText("File Upload");
    By uploadForm = new By.ById("file-upload");
    By uploadButton = new By.ById("file-submit");
    By CheckText = new By.ById("uploaded-files");

    public FileUpload_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFileUpload() {
        WebElement scroll = driver.findElement(navigationLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);
        actions.perform();
        driver.findElement(navigationLink).click();
    }

    public void uploadFile() {
        driver.findElement(uploadForm).sendKeys("/home/ramzo/DSETUP.dll");
        driver.findElement(uploadButton).click();
    }

    public void checkIfUploaded() {
        if(driver.findElement(CheckText).isDisplayed())
            System.out.println("File has been added!");
    }
}