package cn.ianzhang.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;
import java.util.HashMap;

/**
 * @Author: Ian
 * @Date: 2020/9/25 22:28
 * @Description:
 */
@Disabled
public class ChromeDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation"));
        HashMap<String, Object> chromePreferences = new HashMap<>();
        chromePreferences.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", chromePreferences);
        options.addArguments("--no-default-browser-check"
                , "--disable-popup-blocking"
                , "--ignore-certificate-errors"
                , "--disable-extensions"
                , "--start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void test() {
        driver.get("https://www.baidu.com");
        System.out.println();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
