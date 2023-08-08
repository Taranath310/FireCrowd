package org.firecrowd.ProjectMenu;

import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestNgSample3 {
  static BrowserSetUpUtil browserSetUpUtil=new BrowserSetUpUtil();
    static WebDriver driver = browserSetUpUtil.driver;
    @Test
    public static void openBrowser() {
      driver.get("https://www.flipkart.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
      driver.findElement(By.xpath("//input[@name='q']")).click();

      //browserSetUpUtil.closeBrowser();

    }

}
