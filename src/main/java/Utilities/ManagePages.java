package Utilities;                      //A class that will define an object for each page/section class of the app and initialize the
                                        // objects we define in each and every one. Inherits from Base class
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base{

    public static void init(){

        exampleClass = PageFactory.initElements(driver, PageObjects.WebApp.ExampleClass.class);

    }
}
