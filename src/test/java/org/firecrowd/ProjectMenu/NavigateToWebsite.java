package org.firecrowd.ProjectMenu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NavigateToWebsite {
    public static void main(String[] args) {

        //webdrivermanager is class
        //and chromedriver is a static method
        //and setup is non static method
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //get()
        driver.get("https://fireflink.com/");

        //getTitle()
        String title = driver.getTitle();
        System.out.println("title of the website is "+title);
        // System.out.println(driver.getTitle());


        //getCurrentUrl()
        System.out.println("current url of the website is "+driver.getCurrentUrl());

        //getPageSource
        //System.out.println("Page source of the website is "+driver.getPageSource());

        //manage
        driver.manage().window().maximize();
        Point ps = driver.manage().window().getPosition();
        System.out.println(ps);
        Dimension sz = driver.manage().window().getSize();
        System.out.println(sz);



        //navigate

        //getWindowHandle
        //getWindowHandles
        //switvhTo()

        //close()
        driver.close();

        //quit()
        driver.quit();


        driver.findElement(By.id("inputUsername")).sendKeys("devika@ty.com");
        driver.findElement(By.name("inputPassword")).sendKeys("Pass@123");
        driver.findElement(By.className("submit signInBtn")).click();
        driver.findElement(By.tagName("a")).click();
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();


        driver.findElement(By.cssSelector(".signInBtn")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("tara@ty.com");





        WebElement dropDown = driver.findElement(By.xpath("hbdfkjsdbfkjb"));
        Select select=new Select(dropDown);
        select.isMultiple();
        select.getOptions();
        select.getFirstSelectedOption();
        select.getAllSelectedOptions();
        select.selectByVisibleText("xyz");
        select.selectByValue("xyz");
        select.selectByIndex(0);
        select.deselectByVisibleText("xyz");
        select.deselectByValue("abc");
        select.deselectByIndex(8);
        select.deselectAll();


        WebElement createUser = driver.findElement(By.xpath("hbchabs"));

    }
}
