package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite extends TestInit{

    @BeforeTest
    public void init(){
        TestSetup();
    }

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
