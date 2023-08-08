package org.firecrowd.Users;

import PageObjectModel.LoginPage;
import PageObjectModel.UsersPage;
import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CreateUserE2E {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.mangomist.com/contact");
        UsersPage usersPage=new UsersPage(driver);
        usersPage.createUser();
        usersPage.createUser("tara","7892881061","projectOwner");
        usersPage.createUser("taranath","7892881061","projectOwner");

               
        
    }
}
