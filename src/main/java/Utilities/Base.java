package Utilities;              //A class meant for declaring objects being used commonly across the project, such as WebDriver, WebDriverWait, Actions, Screenshot,
                                // PageObjects, primitives and more
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class Base {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenshot;
    public static ImageDiffer imgDiff;
    public static ImageDiff diff;


    public static PageObjects.WebApp.ExampleClass exampleClass;
}
