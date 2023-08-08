package org.firecrowd.ProjectMenu;

import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestNgSample2 {
  static BrowserSetUpUtil browserSetUpUtil=new BrowserSetUpUtil();
    static WebDriver driver = browserSetUpUtil.driver;
    @Test
    public static void openBrowser() {
        driver.get("https://app.fireflink.com/signin");
        driver.findElement(By.xpath("//button[text()='Sign in']")).sendKeys("hi");
        browserSetUpUtil.closeBrowser();
    }
}
