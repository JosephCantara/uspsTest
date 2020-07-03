import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {

        this.driver = driver;
        this.wait = wait;
    }

    String mainUrl = "https://www.usps.com/";


    public void verifyLink(String urlLink) {
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

    public void ajaxClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void performClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void checkLinksOnWebPage(String typeElement, String attribute) {
        List<WebElement> links = driver.findElements(By.xpath(typeElement));
        System.out.println("LINKS ON WEBPAGE ARE  "+ links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute(attribute);
            verifyLinkActive(url);
        }
    }

    public void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseCode());
            } else if (httpURLConnection.getResponseCode() >= 400 && httpURLConnection.getResponseCode() <= 504) {
                System.out.println(linkUrl + "-" + httpURLConnection.getResponseMessage() + "-" + httpURLConnection.getResponseCode());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void clickValueOfLists(By locator, String text){
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size() ; i++) {
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if (value.contains(text)) {
                elementOfList.click();
            }

        }
    }
}
