package WorkFlows;                                      //Represents regular routine tasks and operations that the system does: Creating / removing users,
                                                        // new tasks etc. - Inherits from CommonOps

import PageObjects.WebApp.ExampleClass;
import Utilities.CommonOps;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebFlows extends CommonOps {

    public static String _userName;
    public static String _projectName;



/*    public static void signIn(String userEmail, String userPassword){
        wait.until(ExpectedConditions.visibilityOf(exampleClass.signIn_btn));
        exampleClass.signIn_btn.click();
        wait.until(ExpectedConditions.visibilityOf(exampleClass.userIdentifierInput_Field));
        exampleClass.userIdentifierInput_Field.sendKeys(userEmail);
        exampleClass.next_btn.click();
        wait.until(ExpectedConditions.visibilityOf(exampleClass.userPasswordInput_Field));
        exampleClass.userPasswordInput_Field.sendKeys(userPassword);
        exampleClass.login_btn.click();
    }

    public static void signUp(String name, String email, String password, String companyName) {
        wait.until(ExpectedConditions.visibilityOf(basecampIntroPage.tryItFree_btn));
        basecampIntroPage.tryItFree_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.startFreeTrial_btn));
        basecampSignUpFlow.startFreeTrial_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.nextButtonFirst_btn));
        basecampSignUpFlow.name_Field.clear();
        basecampSignUpFlow.name_Field.sendKeys(name);
        _userName = name;
        basecampSignUpFlow.email_Field.clear();
        basecampSignUpFlow.email_Field.sendKeys(email);
        basecampSignUpFlow.nextButtonFirst_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.createMyAccount_btn));
        basecampSignUpFlow.password_Field.clear();
        basecampSignUpFlow.password_Field.sendKeys(password);
        basecampSignUpFlow.createMyAccount_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.nextButtonSecond_btn));
        basecampSignUpFlow.companyName_Field.clear();
        basecampSignUpFlow.companyName_Field.sendKeys(companyName);
        basecampSignUpFlow.nextButtonSecond_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.nextButtonThird_btn));
        basecampSignUpFlow.nextButtonThird_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.nextButtonForth_btn));
        basecampSignUpFlow.nextButtonForth_btn.click();
        wait.until(ExpectedConditions.visibilityOf(basecampSignUpFlow.allDone_btn));
        basecampSignUpFlow.allDone_btn.click();
    }

    public static void addNewProject(String projectName, String description){
        signIn(getDataFromXML("UserEmail"), getDataFromXML("Password"));
        wait.until(ExpectedConditions.visibilityOf(exampleClass.addAnotherProject_btn));
        exampleClass.addAnotherProject_btn.click();
        wait.until(ExpectedConditions.visibilityOf(ExampleClass.createThisProject_btn));
        ExampleClass.nameThisProject_field.clear();
        ExampleClass.nameThisProject_field.sendKeys(projectName);
        _projectName = projectName;
        ExampleClass.addDescription_box.clear();
        ExampleClass.addDescription_box.sendKeys(description);
        ExampleClass.createThisProject_btn.click();
    }*/
}
