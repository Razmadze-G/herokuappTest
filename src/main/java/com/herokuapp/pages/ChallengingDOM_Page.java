package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ChallengingDOM_Page {
    WebDriver driver;

    By navigationLink = new By.ByLinkText("Challenging DOM");
    By FirstRowOfTheTable = new By.ByXPath("//*[@id=\"content\"]/div/div/div/div[2]/table/tbody/tr[1]/td");

    public ChallengingDOM_Page(WebDriver driver) {
        this.driver = driver;
    }
    public void navigateToCallengingDOM() {
        driver.findElement(navigationLink).click();
    }

    public void checkFirstRowOfTheTable() {
        List<WebElement> cellList = driver.findElements(FirstRowOfTheTable);
        String cell= "";
        boolean zeroInTheEnd = true;
        for (int i = 0; i < cellList.size() - 1; i++) {
            cell = cellList.get(i).getText();
            if (!cell.substring(cell.length() - 1).equals("0")) {
                zeroInTheEnd = false;
                System.out.println("In the first row some text is not ended with zero!");
                break;
            }
        }
        if(zeroInTheEnd){
            System.out.println("In the first row every text is ended with zero!");
        }
    }
}
