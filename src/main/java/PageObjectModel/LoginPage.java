package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    private ProjectMenu projectMenu;

    private By emailInputLocator = By.id("email");
    private By passwordInputLocator = By.name("password");
    private By loginButtonLocator = By.xpath("//button[text()='Sign in']");
    private By forgottenPasswordLinkLocator=By.id("forgetPassword");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailInput = driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordInput = driver.findElement(passwordInputLocator);
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();
    }

    public void clickForgottenPasswordLink() {
        WebElement forgottenPasswordLink = driver.findElement(forgottenPasswordLinkLocator);
        forgottenPasswordLink.click();
    }

    public boolean checkForgotPwdLink(){
        return driver.findElement(forgottenPasswordLinkLocator).isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
    public boolean checkUserLogin() throws InterruptedException {
        projectMenu=new ProjectMenu(driver);
        By projectListTitle = projectMenu.getProjectListTitleLocator();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        return driver.findElement(projectListTitle).isDisplayed();
    }
}
