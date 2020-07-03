import org.openqa.selenium.By;

public class Locators {


    //TITTLE
    public static final By TITTLE_MAIN_PAGE = By.xpath("//h2[contains(text(),'USPS Service Alerts')]");
    public static final By TITTLE_SHOWING_RESULT = By.xpath("//h4[contains(text(),'Showing Results')]//span[@id='resultsPageInfo']");
    public static final By TITTLE_LOCATION_PAGE = By.xpath("//h1[contains(text(),'Find Locations')]");
    public static final By TITTLE_MAILSHIP_PAGE = By.xpath("//div[contains(@class,'hero-text')]");


    //IMG
    public static final By IMG_REG_PAGE = By.xpath("//img[@id='usps-logo']");




    //URL

    public static final By URL_QUICK_TOOLS = By.xpath("//a[@id='link-lang']");
    public static final By URL_MAIL_SHIP = By.xpath("//a[@id='mail-ship-width']");
    public static final By URL_TRACK_MANAGE = By.xpath("//a[contains(text(),'Track & Manage')]");
    public static final By URL_POSTAL_SERVICE = By.xpath("//a[@class='menuitem'][contains(text(),'Postal Store')]");
    public static final By URL_BUSINESS = By.xpath("//a[@class='menuitem'][contains(text(),'Business')]");
    public static final By URL_INTERNATIONAL = By.xpath("//a[@class='menuitem'][contains(text(),'International')]");
    public static final By URL_HELP = By.xpath("//a[@class='menuitem'][contains(text(),'Help')]");



    //XPATH

    public static final By USPS_BOTTOM_PAGE = By.xpath("//ul[@class='global-footer--social']");
    public static final By SOCIAL_MEDIA_FACEBOOK_LINK = By.xpath("//*[@href='https://www.facebook.com/USPS?rf=108501355848630']");
    public static final By SOCIAL_MEDIA_TWITTER_LINK = By.xpath("//*[@href='https://twitter.com/usps']");
    public static final By SOCIAL_MEDIA_PINTEREST_LINK = By.xpath("//*[@href='http://www.pinterest.com/uspsstamps/']");
    public static final By SOCIAL_MEDIA_YOUTUBE_LINK = By.xpath("//*[@href='https://www.youtube.com/usps']");


    //registration page
    public static final By SIGNUP_PAGE_SELECT_LANG= By.xpath("//select[@id='slanguage']/option[@value='en']");
    public static final By SIGNUP_PAGE_USER_NAME= By.xpath("//input[@id='tuserName']");
    public static final By SIGNUP_PAGE_USER_FIRSTNAME= By.xpath("//input[@id='tfName']");
    public static final By SIGNUP_PAGE_USER_LASTNAME= By.xpath("//input[@id='tlName']");
    public static final By SIGNUP_PAGE_USER_PHONE= By.xpath("//input[@id='tphone']");
    public static final By SIGNUP_PAGE_USER_PASSWORD= By.xpath("//input[@id='tPassword']");
    public static final By SIGNUP_PAGE_USER_RE_TYPEPASSWORD= By.xpath("//input[@id='tPasswordRetype']");
    public static final By SECURITY_QUESTION1= By.xpath("//select[@id='ssec1']/option[@value='1']");
    public static final By SECURITY_QUESTION1_ANSWER = By.xpath("//input[@id='tsecAnswer1']");
    public static final By SECURITY_QUESTION1_ANSWER_MATCH = By.xpath("//input[@id='tsecAnswer1Match']");
    public static final By SECURITY_QUESTION2= By.xpath("//select[@id='ssec2']/option[@value='2']");
    public static final By SECURITY_QUESTION2_ANSWER = By.xpath("//input[@id='tsecAnswer2']");
    public static final By SECURITY_QUESTION2_ANSWER_MATCH = By.xpath("//input[@id='tsecAnswer2Match']");
    public static final By SIGNUP_PAGE_USER_NAME_TITTLE= By.xpath("//select[@id='stitle']/option[@value='Mr']");
    public static final By SIGNUP_PAGE_USER_EMAIL= By.xpath("//input[@id='temail']");
    public static final By SIGNUP_PAGE_USER_EMAIL_RETYPE= By.xpath("//input[@id='temailRetype']");
    public static final By SIGNUP_PAGE_USER_ADDRESS= By.xpath("//input[@id='taddress']");
    public static final By SIGNUP_PAGE_USER_ADDRESS_ZIPCODE= By.xpath("//input[@id='tzip']");
    public static final By SIGNUP_PAGE_USER_CITY= By.xpath("//input[@id='tcity']");
    public static final By SIGNUP_PAGE_USER_STATE= By.xpath("//div[@id='us']//div[@id='form-group-sstate']//select");

    public static final By TRACK_A_PACKAGE = By.xpath("//li[@class='qt-nav menuheader']//*[@href='https://tools.usps.com/go/TrackConfirmAction_input']");


    //LINK
    public static final By REGISTER_SIGNIN_LINK = By.xpath("//a[@id='login-register-header']");
    public static final By QUICK_TOOLS = By.xpath("//a[@class='nav-first-element menuitem']");
    public static final By MAILS_SHIP = By.xpath("//a[@href='https://www.usps.com/ship/'][@id='mail-ship-width']");


    //LOCATION PAGE
    public static final By USPS_LOCATION = By.xpath("//a[@href='https://tools.usps.com/find-location.htm'][@id='link-locator']");
    public static final By FIND_LOCATION_ZIPCODE = By.xpath("//input[@id='city-state-input']");
    public static final By LOCATION_FILTER_BY_TYPES = By.xpath("//ul[@class='dropdown-menu']//a[@data-value='po']");
    public static final By LOCATION_FILTER_BY_TYPES_BUTTON = By.xpath("//button[@id='post-offices-select']");
    public static final By LOCATION_SERVICE_TYPE_BUTTON = By.xpath("//button[@id='service-type-select']");
    public static final By LOCATION_SELECTED_SERVICE = By.xpath("//li[@id='busPo']//a[contains(text(),'Business Services')]");
    public static final By LOCATION_WITHIN_MILES = By.xpath("//button[@id='within-select']");
    public static final By LOCATION_WITHIN_SELECTED_MILES = By.xpath("//a[contains(text(),'25 Miles')]");
    public static final By LOCATION_SEARCH_BUTTON = By.xpath("//a[@id='searchLocations']");
    public static final By LOCATIONS_SHOWS_IN_MAP = By.xpath("//div[@class='esri-view-surface']//canvas");
    public static final By FOOTER = By.xpath("//body/div[@id='global-footer']/div[@id='global-footer--wrap']/footer" +
            "[@class='global-footer']/nav[@class='global-footer--navigation']//li[@class='global-footer--navigation-category']//li");





    //BUTTON

    public static final By SIGN_UP_BUTTON = By.xpath("//a[@id='sign-up-button']");
    public static final By VERIFY_ADDRESS_BUTTON = By.xpath("//a[@id='a-address-step1']");
    public static final By VERIFY_ADDRESS_CONTINUE_BUTTON = By.xpath("//a[@id='a-address-step2']");
    public static final By ADDRESS_FINISH_BUTTON = By.xpath("//a[@id='a-address-step3']");
    public static final By CREATE_ACCOUNT_BUTTON = By.xpath("//a[@id='btn-submit']");



    //WAIT UNTIL

    public static final By SIGN_UP_PAGE = By.xpath("//body/div[1]");
    public static final By SIGN_UP_PAGE_2 = By.xpath("//strong[contains(text(),'Enter your contact information')]");


   // RADIO BUTTON AND CHECK BOX
    public static final By PERSONAL_ACCOUNT_RADIO = By.xpath("//input[@id='rAccount1']");
    public static final By SIGN_UP_PAGE_CHECKBOX = By.xpath("//input[@id='cFrmUSPS']");





}
