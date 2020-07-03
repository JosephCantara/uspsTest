import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocationPage extends BaseActions {
    public LocationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void uspsfindLocationByZipcode() {
        driver.findElement(Locators.USPS_LOCATION).click();
        driver.findElement(Locators.FIND_LOCATION_ZIPCODE).sendKeys(Data.findLocationzipcode);
        driver.findElement(Locators.LOCATION_FILTER_BY_TYPES_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_FILTER_BY_TYPES));
        driver.findElement(Locators.LOCATION_FILTER_BY_TYPES).click();
        driver.findElement(Locators.LOCATION_SERVICE_TYPE_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_SELECTED_SERVICE));
        driver.findElement(Locators.LOCATION_SELECTED_SERVICE).click();
        driver.findElement(Locators.LOCATION_WITHIN_MILES).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_WITHIN_SELECTED_MILES));
        driver.findElement(Locators.LOCATION_WITHIN_SELECTED_MILES).click();
        driver.findElement(Locators.LOCATION_SEARCH_BUTTON).click();
    }

    public void uspsfindLocationByCity() {
        driver.findElement(Locators.USPS_LOCATION).click();
        driver.findElement(Locators.FIND_LOCATION_ZIPCODE).sendKeys(Data.findLocationcity);
        driver.findElement(Locators.LOCATION_FILTER_BY_TYPES_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_FILTER_BY_TYPES));
        driver.findElement(Locators.LOCATION_FILTER_BY_TYPES).click();
        driver.findElement(Locators.LOCATION_SERVICE_TYPE_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_SELECTED_SERVICE));
        driver.findElement(Locators.LOCATION_SELECTED_SERVICE).click();
        driver.findElement(Locators.LOCATION_WITHIN_MILES).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.LOCATION_WITHIN_SELECTED_MILES));
        driver.findElement(Locators.LOCATION_WITHIN_SELECTED_MILES).click();
        driver.findElement(Locators.LOCATION_SEARCH_BUTTON).click();
    }

    public void checkLinksOnLocation() {
        driver.findElement(Locators.USPS_LOCATION).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.TITTLE_LOCATION_PAGE));
        checkLinksOnWebPage("//a", "href");

    }
}