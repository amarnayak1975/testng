package testngselenium;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginExcelTest extends BaseTest {

    @Test(dataProvider = "excelData")
    public void loginTest(String username, String password, String expectedResult) {

        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage login = new LoginPage(driver);

        login.login(username, password);

        if (expectedResult.equalsIgnoreCase("success")) {
            Assert.assertTrue(login.getMessage().contains("You logged into a secure area"));
        } else {
            Assert.assertTrue(login.getMessage().contains("invalid"));
        }
    }

    @DataProvider(name = "excelData")
    public Object[][] getData() {
        return ExcelUtils.getExcelData(
                "E:\\notes\\selenium\\LoginData.xlsx", "Sheet1");
    }
}

