package Utilities;          //A class that implements the Listeners interface. inherits from CommonOps, implements ITestListener

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

import static Utilities.HelperMethods.captureScreenshotMobile;

public class Listeners extends CommonOps implements ITestListener {


    public void onStart(ITestContext execution) {
        System.out.println("---------------------------Starting Execution---------------------------");
    }

    public void onFinish(ITestContext execution) {
        System.out.println("----------------------------Ending Execution----------------------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult test) {
        System.out.println("-------------------Test " + test.getName() + " Failed!-------------------");
        if (platform.equalsIgnoreCase("mobile")) {
            try {
                captureScreenshotMobile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else saveScreenshot();
    }

    public void onTestSkipped(ITestResult test) {
        System.out.println("------------------Skipping Test: " + test.getName() + "------------------");
    }

    public void onTestStart(ITestResult test) {
        System.out.println("------------------Starting Test: " + test.getName() + "------------------");
    }

    public void onTestSuccess(ITestResult test) {
        System.out.println("-------------Test " + test.getName() + " Successfully Passed-------------");
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}

