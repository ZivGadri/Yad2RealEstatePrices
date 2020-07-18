package Utilities;              //A class that provide with all the routine operations and methods being used with every test run, mainly for initializing drivers and browsers,
                                // main logical TestNG annotations (Before / After class / Test), reading execution xml file parameters and initializing them. etc.
                                // Inherits from Base class

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import static Utilities.HelperMethods.getDataFromXML;

public class CommonOps extends Base {

    public static void initBrowser() {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = initChromeDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            driver = initIEDriver();
        } else {
            throw new RuntimeException("Invalid Browser Name Selected.");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getDataFromXML("Timeout")), TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getDataFromXML("Timeout")));
        action = new Actions(driver);
    }

    public static WebDriver initChromeDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initIEDriver() {
        WebDriverManager.iedriver().setup();
        WebDriver driver = new InternetExplorerDriver();
        return driver;
    }

    @BeforeClass
    @Parameters({"platformName", "siteTested", "browserName"})
    public void startSession(String platformName, String siteTested, @Optional("noBrowserForMobile") String browserName) {
        platform = platformName;
        webSite = siteTested;
        browser = browserName;
        if (platform.equalsIgnoreCase("web")) {
            initBrowser();
            ManagePages.initWeb();
        } else {
            throw new RuntimeException("Given Platform Is Invalid.");
        }
        ManageDB.initConnection(getDataFromXML("DBURL"), getDataFromXML("DBuser"), getDataFromXML("DBpassword"));
    }

    @AfterClass
    public void closeSession() {
        ManageDB.closeConnection();
        if (platform.equalsIgnoreCase("web")) {
            driver.quit();
        }
    }


}
