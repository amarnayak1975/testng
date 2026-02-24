package testngselenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginCSVTest extends BaseTest {

    @Test(dataProvider = "csvData")
    public void loginTest(String username, String password, String expectedResult) {

        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage login = new LoginPage(driver);

        login.login(username, password);

        if (expectedResult.equalsIgnoreCase("success")) {
            Assert.assertTrue(
                login.getMessage().contains("You logged into a secure area"),
                "Positive login failed"
            );
        } else {
            Assert.assertTrue(
                login.getMessage().contains("invalid"),
                "Negative test case failed"
            );
        }
    }

    @DataProvider(name = "csvData")
    public Object[][] getData() {
        return CSVUtils.getCSVData("E:\\notes\\selenium\\logindata.csv");
    }
}
