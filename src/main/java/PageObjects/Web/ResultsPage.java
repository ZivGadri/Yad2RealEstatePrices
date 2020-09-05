package PageObjects.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage {

    @FindBy(how = How.XPATH, using = "//*[@id='ads_count']")
    public WebElement numberOfAds_txt;

    @FindBy(how = How.XPATH, using = "//h1")
    public WebElement resultPageTitle_txt;
}
