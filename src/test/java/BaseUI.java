import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;

public class BaseUI {

    WebDriver driver;
    WebDriverWait wait;
    String mainUrl = "https://www.usps.com/";
    RegistrationPage registrationPage;
    MainPage mainPage;
    LocationPage locationPage;



    @BeforeMethod

    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method){

        // Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver");
            driver = new FirefoxDriver();
        }
        // Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
            // Set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            // Create chrome instance
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();


        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        }

        wait = new WebDriverWait(driver,20);
        registrationPage = new RegistrationPage (driver, wait);
        mainPage = new MainPage(driver, wait);
        locationPage = new LocationPage(driver,wait);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod

    public void afterAction () {

        //driver.quit();
    }

    public static void verifyLink(String urlLink) {
        try {
            URL link = new URL(urlLink);
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.setConnectTimeout(2000);
            httpConn.connect();
            if (httpConn.getResponseCode() == 200) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage());
            }
            if (httpConn.getResponseCode() == 404) {
                System.out.println(urlLink + " - " + httpConn.getResponseMessage());
            }
        } catch (Exception e) {
        }
    }


}