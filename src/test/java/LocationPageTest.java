
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class LocationPageTest extends BaseUI {

    String actualShowingResultTittle;

    @Test
    public void findLocationByZipcode() {
        locationPage.uspsfindLocationByZipcode();

        actualShowingResultTittle = driver.findElement(Locators.TITTLE_SHOWING_RESULT).getText();
        Assert.assertEquals(actualShowingResultTittle, Data.expectedTittleShowingResult);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATIONS_SHOWS_IN_MAP));
        Assert.assertTrue(driver.findElement(Locators.LOCATIONS_SHOWS_IN_MAP).isDisplayed());
    }

    @Test
    public void findLocationByCityName() {
        locationPage.uspsfindLocationByCity();

        actualShowingResultTittle = driver.findElement(Locators.TITTLE_SHOWING_RESULT).getText();
        Assert.assertEquals(actualShowingResultTittle, Data.expectedTittleShowingResult);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATIONS_SHOWS_IN_MAP));
        Assert.assertTrue(driver.findElement(Locators.LOCATIONS_SHOWS_IN_MAP).isDisplayed());


    }

    @Test
    public void locationFooterLinks() throws InterruptedException {
        driver.findElement(Locators.USPS_LOCATION).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement footer = driver.findElement(Locators.FOOTER);
        js.executeScript("arguments[0].scrollIntoView();", footer);
        Thread.sleep(2000);

        List<WebElement> footerLinksLocationPage = driver.findElements(Locators.FOOTER);
        System.out.println("Total links are " + footerLinksLocationPage.size());
        for (int i = 0; i < footerLinksLocationPage.size(); i++) {
            String linksName = footerLinksLocationPage.get(i).getText();
            System.out.println(linksName);
            verifyLink(linksName);

        }
    }


    @Test
    public void zoomOutInMap() {
        locationPage.uspsfindLocationByZipcode();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATIONS_SHOWS_IN_MAP));

        //ZOOM OUT IN
        WebElement canvasZoom = driver.findElement(By.xpath("//div[@class='esri-view-surface']//canvas"));
        Actions zoom = new Actions(driver);
        zoom.clickAndHold(canvasZoom).moveByOffset(500,50).
                moveByOffset(-250,-10).release().perform();
    }
    @Test
    public void checkLinksOnFindLocationPage() {
        locationPage.checkLinksOnLocation();
    }
}

