import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPage extends BaseActions {

    public  MainPage  (WebDriver driver, WebDriverWait wait) {
        super(driver,wait);

    }
    public void hoverMouseQuickTools() {
        Actions actions= new Actions(driver);

        WebElement quickTools = driver.findElement(Locators.QUICK_TOOLS); //Quick toolsXPATH
        actions.moveToElement(quickTools).perform();

        WebElement subMenuQuickTools = driver.findElement(Locators.TRACK_A_PACKAGE);
        actions.moveToElement(subMenuQuickTools).click(); //TRACKPACKAGE XPATH

        System.out.println(subMenuQuickTools.getText());
    }
    public void testMainPageLinks() {
        List<WebElement> navLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total links are " + navLinks.size());
        for (int i = 0; i < navLinks.size(); i++) {
            WebElement element = navLinks.get(i);
            String url = element.getAttribute("href");
            verifyLink(url);
        }
    }
    //Total LINKS in NAV MENU

    public void findNavMenuTotalLinks() {
        List<WebElement> totalLinks = driver.findElements(By.xpath("//div[@class='nav-full']"));
        System.out.println(totalLinks.size());
        for (int i = 0; i < totalLinks.size(); i++) {

            String linksName = totalLinks.get(i).getText();
            System.out.println(linksName);
        }
    }
    public void socialMediaLinkTest(){
        //SCROLL DOWN THE PAGE

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,-350)", "");

        WebElement Element = driver.findElement(Locators.USPS_BOTTOM_PAGE);
        js.executeScript("arguments[0].scrollIntoView();", Element);

        driver.findElement(Locators.SOCIAL_MEDIA_FACEBOOK_LINK).click();
        driver.get(mainUrl);

        driver.findElement(Locators.SOCIAL_MEDIA_TWITTER_LINK).click();
        driver.get(mainUrl);

        driver.findElement(Locators.SOCIAL_MEDIA_PINTEREST_LINK).click();
        driver.get(mainUrl);

        driver.findElement(Locators.SOCIAL_MEDIA_YOUTUBE_LINK).click();
        driver.get(mainUrl);

    }
    public void checkLinksOnMailShip(){
        driver.findElement(Locators.MAILS_SHIP).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.TITTLE_MAILSHIP_PAGE));
        checkLinksOnWebPage("//a","href");

    }

}


