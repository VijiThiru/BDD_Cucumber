package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumMtds extends BaseTest{

    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getTextFromElement(By elementLocator){
        return driver.findElement(elementLocator).getText();
    }

    public void waitForElementVisibility(By elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, Util.ELEMENTWATTIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));

    }




}
