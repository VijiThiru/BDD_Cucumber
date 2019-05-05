package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static WebDriver driver;
    public static Properties prop;

    public BaseTest(){
        try (InputStream input = BaseTest.class.getClassLoader().getResourceAsStream("Global.properties")) {
            prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
            }
            prop.load(input);
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public static void intilization(){
        String value = prop.getProperty("browser");
        if(value.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok\\Desktop\\VIJI\\TestAutomation\\openweather\\src\\exefiles\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(value.equals("firefox")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashok\\Desktop\\VIJI\\TestAutomation\\openweather\\src\\exefiles\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Util.PAGETIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Util.IMPLICITWAIT, TimeUnit.SECONDS);

        driver.get(prop.getProperty("url"));
    }
}
