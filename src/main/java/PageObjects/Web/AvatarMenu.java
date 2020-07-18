package PageObjects.Web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AvatarMenu {

    @FindBy(how = How.LINK_TEXT, using = "My profile (avatar, title, password, etc)")
    public WebElement myProfile_btn;

    @FindBy(how = How.XPATH, using = "//li[3]/a")
    public WebElement logOut_btn;

}
