package cn.ianzhang.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

import java.util.Collections;
import java.util.HashMap;

/**
 * @Author: Ian
 * @Date: 2020/9/25 22:28
 * @Description:
 */
@Disabled
public class OperaDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        OperaOptions options = new OperaOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
        HashMap<String, Object> chromePreferences = new HashMap<>();
        chromePreferences.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", chromePreferences);
        options.addArguments("--no-default-browser-check"
                , "--disable-popup-blocking"
                , "--ignore-certificate-errors"
                , "--disable-extensions"
                , "--start-maximized");
        driver = new OperaDriver();
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
