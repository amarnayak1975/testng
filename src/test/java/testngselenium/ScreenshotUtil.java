package testngselenium;

import io.qameta.allure.Attachment;
import org.openqa.selenium.*;

public class ScreenshotUtil 
{

    @Attachment(value = "Failure Screenshot", type = "image/png")
    public static byte[] captureScreenshot(WebDriver driver) {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
