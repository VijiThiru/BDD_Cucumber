package pages;

import base.BaseTest;
import base.SeleniumMtds;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.*;

public class HomePage extends BaseTest {

    public static String signInSucessMsgPath = "//div[contains(text(),'Signed in successfully.')]";


    public HomePage(){
        PageFactory.initElements(driver, this);
    }


    public void verifySuccessMessage(String message){
        String getUiMessage = new SeleniumMtds().getTextFromElement(By.xpath(signInSucessMsgPath));
        Assert.assertEquals(message, getUiMessage);
    }


}
