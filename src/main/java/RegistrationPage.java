import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BaseActions {

    public  RegistrationPage (WebDriver driver, WebDriverWait wait) {
        super(driver,wait);

    }

    public void firstPartOfRegistrationPage()  {


        driver.findElement(Locators.REGISTER_SIGNIN_LINK).click();
        driver.findElement(Locators.SIGN_UP_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIGN_UP_PAGE));
        driver.findElement(Locators.SIGNUP_PAGE_SELECT_LANG).click();
        driver.findElement(Locators.SIGNUP_PAGE_USER_NAME).sendKeys(Data.username); //changed after each run
        driver.findElement(Locators.SIGNUP_PAGE_USER_PASSWORD).sendKeys(Data.password);
        driver.findElement(Locators.SIGNUP_PAGE_USER_RE_TYPEPASSWORD).sendKeys(Data.password);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SECURITY_QUESTION1));
        driver.findElement(Locators.SECURITY_QUESTION1).click();
        driver.findElement(Locators.SECURITY_QUESTION2).click();
        driver.findElement(Locators.SECURITY_QUESTION1_ANSWER).sendKeys(Data.sec_que1_answer);
        driver.findElement(Locators.SECURITY_QUESTION1_ANSWER_MATCH).sendKeys(Data.sec_que1_answer);
        driver.findElement(Locators.SECURITY_QUESTION2_ANSWER).sendKeys(Data.sec_que2_answer);
        driver.findElement(Locators.SECURITY_QUESTION2_ANSWER_MATCH).sendKeys(Data.sec_que2_answer);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.PERSONAL_ACCOUNT_RADIO));

        //RADIO BUTTON
        WebElement personalAccountButton = driver.findElement(Locators.PERSONAL_ACCOUNT_RADIO);
        personalAccountButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.SIGN_UP_PAGE_2));
    }
    public void secondPartOfRegistrationPage() {
        driver.findElement(Locators.SIGNUP_PAGE_USER_NAME_TITTLE).click();
        driver.findElement(Locators.SIGNUP_PAGE_USER_EMAIL).sendKeys(Data.email); //changed after each run
        driver.findElement(Locators.SIGNUP_PAGE_USER_EMAIL_RETYPE).sendKeys(Data.email); //changed after each run
        driver.findElement(Locators.SIGNUP_PAGE_USER_FIRSTNAME).sendKeys(Data.firstname);
        driver.findElement(Locators.SIGNUP_PAGE_USER_LASTNAME).sendKeys(Data.lastname);
        driver.findElement(Locators.SIGNUP_PAGE_USER_PHONE).sendKeys(Data.phone);


        //SELECT CHECKBOX
        WebElement checkboxUSPS = driver.findElement(Locators.SIGN_UP_PAGE_CHECKBOX);
        boolean selectCheckboxUSPS = checkboxUSPS.isSelected();
        System.out.println(selectCheckboxUSPS);
        checkboxUSPS.click();
    }

    public void thirdPartOfRegistrationPage()  {
        driver.findElement(Locators.SIGNUP_PAGE_USER_ADDRESS).sendKeys(Data.address);
        driver.findElement(Locators.SIGNUP_PAGE_USER_CITY).sendKeys(Data.city);

        //SELECT DROPDOWN BY VALUE
        Select dropDownState = new Select(driver.findElement(Locators.SIGNUP_PAGE_USER_STATE));
        dropDownState.selectByValue("IN");

        driver.findElement(Locators.SIGNUP_PAGE_USER_ADDRESS_ZIPCODE).sendKeys(Data.zipcode);
        driver.findElement(Locators.VERIFY_ADDRESS_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.VERIFY_ADDRESS_CONTINUE_BUTTON));
        driver.findElement(Locators.VERIFY_ADDRESS_CONTINUE_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.ADDRESS_FINISH_BUTTON));
        driver.findElement(Locators.ADDRESS_FINISH_BUTTON).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.CREATE_ACCOUNT_BUTTON));
        driver.findElement(Locators.CREATE_ACCOUNT_BUTTON).click();
    }
}
