package cn.ianzhang.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @Author: Ian
 * @Date: 2020/9/25 22:28
 * @Description:
 */
@Disabled
public class SafariDriverTest {
    private WebDriver driver;

    @BeforeEach
    public void setup() throws Exception {
        driver = new SafariDriver();
    }

    @Disabled
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
