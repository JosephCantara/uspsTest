
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationPageTest extends BaseUI {

    String actualImgRegPage;
    String actualURLRegistrationPage;


    @Test
    public void navigateToRegPage() {
        driver.findElement(Locators.REGISTER_SIGNIN_LINK).click();

        actualImgRegPage = driver.findElement(Locators.IMG_REG_PAGE).getAttribute("id");
        Assert.assertEquals(actualImgRegPage, Data.expectedIMGRegPage);

        actualURLRegistrationPage = driver.getCurrentUrl();
        Assert.assertEquals(actualURLRegistrationPage, Data.expectedURLRegistrationPage);

        //VERIFY REGISTRATION PAGE IMG and URL
    }

    @Test
    public void signUpNow() {
        registrationPage.firstPartOfRegistrationPage();
        registrationPage.secondPartOfRegistrationPage();
        registrationPage.thirdPartOfRegistrationPage();

    }

}
