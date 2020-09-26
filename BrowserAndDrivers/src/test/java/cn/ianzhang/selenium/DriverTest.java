package cn.ianzhang.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

/**
 * @Author: Ian
 * @Date: 2020/9/22 22:03
 * @Description:
 */
@Disabled
public class DriverTest extends DriverBase{
    private WebDriver driver;
    @BeforeEach
    public void setup() throws Exception {
        System.out.println("browser:"+System.getProperty("browser"));
        System.out.println("webdriver.chrome.driver:"+System.getProperty("webdriver.chrome.driver"));
//        if (Objects.isNull(
//                System.getProperty("webdriver.chrome.driver")
//        )) {
//            System.setProperty("webdriver.chrome.driver",
//                    System.getProperty("user.dir")
//                            + "\\..\\"
//                            + ".driver\\selenium_standalone_binaries\\windows\\googlechrome\\64bit\\chromedriver.exe"
//            );
//        }
        driver = getDriver();;
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
