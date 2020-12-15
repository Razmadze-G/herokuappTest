package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ShiftingContent_Page {
    WebDriver driver;

    By navigationLink = new By.ByLinkText("Shifting Content");
    By homeLink = new By.ByLinkText("Example 1: Menu Element");
    By imageLink = new By.ByLinkText("Example 2: An image");
    By shifterLink = new By.ByXPath("//*[@id=\"content\"]/div/p[3]/a");
    By image = new By.ByClassName("shift");

    public ShiftingContent_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToShiftingContent() {
        WebElement scroll = driver.findElement(navigationLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(scroll);
        actions.perform();
        driver.findElement(navigationLink).click();
    }

    public void CheckIfHomeButtonStyleChanges() {
        WebElement HomeLinkElement = driver.findElement(homeLink);
        String colorBeforeHover = HomeLinkElement.getCssValue("color");
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder.moveToElement(HomeLinkElement).build();
        mouseOverHome.perform();
        if (!colorBeforeHover.equals(HomeLinkElement.getCssValue("color"))) {
            System.out.println("Color of the link changes on hover");
        } else {
            System.out.println("Color of the link does not change on hover");
        }
    }

    public void CheckImageOnButtonClick() {
        driver.findElement(imageLink).click();
        Point locationBeforeClick = driver.findElement(image).getLocation();
        int xcord = locationBeforeClick.getX();
        driver.findElement(shifterLink).click();
        if (xcord != locationBeforeClick.getX()) {
            System.out.println("Image has been shifted");
        } else {
            System.out.println("Image has not been shifted");
        }
    }
}