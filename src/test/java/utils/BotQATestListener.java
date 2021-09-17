package test.java.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BotQATestListener implements ITestListener {

    @Override
    public void onStart(ITestContext iTestContext){
        Log.log("Test execution started");
    }

    @Override
    public void onFinish(ITestContext context) {
        Log.log("Test execution completed");
    }

    @Override
    public void onTestStart(ITestResult result) {
        Log.log("New Test Started with test case " +result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.log("Test case " +result.getName()+" passed!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Log.log("Test case "+result.getName()+" failed! Please have a look.");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.log("Test case " +result.getName()+" was skipped! Please have a look.");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
}
