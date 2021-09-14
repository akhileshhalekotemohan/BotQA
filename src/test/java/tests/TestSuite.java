package tests;

import io.qameta.allure.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.BotQATestListener;

@Listeners(value=BotQATestListener.class)
public class TestSuite extends TestInit{

    @BeforeTest
    public void init(){
        TestSetup();
    }

    @Description("Verify google home page loads")
    @Epic("EP001")
    @Feature("Login")
    @Severity(SeverityLevel.BLOCKER)
    @Step("Loading home page")
    @Test
    public void testCaseToCheckTitle(){
        openUrl("https://www.google.com");
        assertTitle("Google");
    }

    @AfterTest
    public void  cleanup() {
        TestCleanUp();
    }
}
