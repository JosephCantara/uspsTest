
import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends BaseUI {

    String actualTittleMainPage;
    String currentUrl;
    String actualURLQuickTools;
    String actualURLMailShip;
    String actualURLTrackManage;
    String actualURLPostalService;
    String actualURLBusiness;
    String actualURLInternational;
    String actualURLHelp;

    @Test
    public void testMainPageTittle() {

        actualTittleMainPage = driver.findElement(Locators.TITTLE_MAIN_PAGE).getText();
        Assert.assertEquals(actualTittleMainPage, Data.expectedTittleMainPage);

        currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

    }

    @Test
    public void testMainPageNavMenuUrlTest() {

        driver.findElement(Locators.URL_MAIL_SHIP).click();
        actualURLMailShip = driver.getCurrentUrl();
        System.out.println(actualURLMailShip);
        Assert.assertEquals(actualURLMailShip, Data.expectedURLMailShip);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_QUICK_TOOLS).click();
        actualURLQuickTools = driver.getCurrentUrl();
        System.out.println(actualURLQuickTools);
        Assert.assertEquals(actualURLQuickTools, Data.expectedURLQuickTools);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_TRACK_MANAGE).click();
        actualURLTrackManage = driver.getCurrentUrl();
        System.out.println(actualURLTrackManage);
        Assert.assertEquals(actualURLTrackManage, Data.expectedURLTrackManage);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_POSTAL_SERVICE).click();
        actualURLPostalService = driver.getCurrentUrl();
        System.out.println(actualURLPostalService);
        Assert.assertEquals(actualURLPostalService, Data.expectedURLPostalStore);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_BUSINESS).click();
        actualURLBusiness = driver.getCurrentUrl();
        System.out.println(actualURLBusiness);
        Assert.assertEquals(actualURLBusiness, Data.expectedURLBusiness);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_HELP).click();
        actualURLHelp = driver.getCurrentUrl();
        System.out.println(actualURLHelp);
        Assert.assertEquals(actualURLHelp, Data.expectedURLHelp);
        driver.get(mainUrl);

        driver.findElement(Locators.URL_INTERNATIONAL).click();
        actualURLInternational = driver.getCurrentUrl();
        System.out.println(actualURLInternational);
        Assert.assertEquals(actualURLInternational, Data.expectedURLInternational);
        driver.get(mainUrl);

    }

    @Test
    public void socialMediaLinksTest() {
        mainPage.socialMediaLinkTest();
    }

    // FIND TOTAL NUMBER OF LINKS AND GET TEXT

    @Test
    public void findTotalLinks() {


        mainPage.findNavMenuTotalLinks();
    }

    @Test
    public void navlinkTest() {

        mainPage.testMainPageLinks();
    }

    @Test
    public void hoverMouseOnQuickTools() {

        mainPage.hoverMouseQuickTools();
    }

    @Test
    public void checkLinksOnMailsShip() {
        mainPage.checkLinksOnMailShip();
    }


}

