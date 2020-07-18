package Utilities;
//A class meant for declaring objects being used commonly across the project, such as WebDriver, WebDriverWait, Actions, Screenshot, PageObjects, primitives and more.

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class Base {

    //Drivers
    public static WebDriver driver = null;

    //Helpers
    public static JavascriptExecutor js = (JavascriptExecutor) driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static SimpleDateFormat dateFormat;

    //Parameters Variables
    public static String platform;
    public static String webSite;
    public static String browser;

    //Variables containing data info that is fed to the DB while signing up a new user.

    //DB Connection
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    //Page Objects Web
    public static PageObjects.Web.AvatarMenu basecampIntroPage;

}
