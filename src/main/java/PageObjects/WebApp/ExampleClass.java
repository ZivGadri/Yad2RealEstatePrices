package PageObjects.WebApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class ExampleClass {

    @FindBy(how = How.XPATH, using="//*[@id=\"top\"]/ul/li[6]/a")
    public WebElement signIn_btn;

    @FindBy(how = How.XPATH, using="//*[@id=\"top\"]/ul/li[7]/a")
    public WebElement tryItFree_btn;

    @FindBy(how = How.XPATH, using = "//div/article[@id]")
    public List<WebElement> projects_list;

    @FindBy(how = How.XPATH, using = "//header/h1")
    public WebElement pageTitle_txt;

}
