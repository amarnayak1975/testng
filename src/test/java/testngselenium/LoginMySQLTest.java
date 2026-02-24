package testngselenium;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginMySQLTest extends BaseTest {

    @Test(dataProvider = "mysqlData")
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

    @DataProvider(name = "mysqlData")
    public Object[][] getData() {
        return DBUtil.getMySQLData();
    }
}
