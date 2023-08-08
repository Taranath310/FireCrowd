package org.firecrowd.ProjectMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestNgSample1 {
    static BrowserSetUpUtil browserSetUpUtil = new BrowserSetUpUtil();
    static WebDriver driver = browserSetUpUtil.driver;

    @Test
    public static void openBrowser() throws IOException {
        driver.get("https://www.qspiders.com/");
//    browserSetUpUtil.closeBrowser();
//    String batCommand = "cmd /c start C:\\Users\\User\\OneDrive\\Desktop\\curl.bat";
//    Runtime.getRuntime().exec(batCommand);
    }
}
