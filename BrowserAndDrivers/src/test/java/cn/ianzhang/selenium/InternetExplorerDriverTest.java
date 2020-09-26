package cn.ianzhang.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

/**
 * @Author: Ian
 * @Date: 2020/9/25 22:28
 * @Description:
 */
@Disabled
public class InternetExplorerDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        InternetExplorerOptions options = new InternetExplorerOptions();
        options.setCapability("allow-blocked-content", true);
        options.setCapability("allowBlockedContent", true);
        options.setCapability("ignoreZoomSetting", true);
        options.setCapability("ignoreProtectedModeSettings", true);
        options.setCapability("requireWindowFocus", true);
        options.setCapability("nativeEvents", false);
        options.setCapability("enablePersistentHover", false);
        driver = new InternetExplorerDriver(options);
    }

    @Test
    public void test() {
        driver.get("https://www.baidu.com");
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
