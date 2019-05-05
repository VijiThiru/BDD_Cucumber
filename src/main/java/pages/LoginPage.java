package pages;

import base.BaseTest;
import base.SeleniumMtds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

    @FindBy(xpath = "//a[text()=' Sign In']")
    WebElement signInBtn;

    @FindBy(id = "user_email")
    WebElement userId;

    @FindBy(id = "user_password")
    WebElement password;

    @FindBy(name = "commit")
    WebElement submitBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage logIn(){
        signInBtn.click();
        userId.sendKeys(prop.getProperty("userName"));
        password.sendKeys(prop.getProperty("password"));
        submitBtn.click();
        return new HomePage();
    }

}
