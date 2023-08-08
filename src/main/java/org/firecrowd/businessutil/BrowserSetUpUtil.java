package org.firecrowd.businessutil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserSetUpUtil {
    public static WebDriver driver;

    public BrowserSetUpUtil() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options); //browser will get launch
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
    }
    public void openBrowser() {
        driver.get("https://preprod.firecrowd.com/");
        driver.manage().window().maximize();
        //   driver.manage().window().fullscreen();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
