package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
    WebDriver driver;
    public UsersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//h1")
    WebElement createUser;

    public WebElement getCreateUserButton(){
        return createUser;
    }

    @FindBy(xpath = "//h1")
    WebElement userName;

    @FindBy(xpath = "//h1")
    WebElement phoneNumber;


    @FindBy(xpath = "//h1")
    WebElement role;

    @FindBy(xpath = "//*[@id='user_full_name']")
    WebElement editUser;

    @FindBy(xpath = "//*[@id='user_email_login']")
    WebElement deleteUser;

    @FindBy(xpath = "//*[@id='user_email_login']")
    WebElement submit;

    @FindBy(xpath = "//*[@id='user_password']")
    WebElement userListTitle;


    @FindBy(xpath = "//*[@id='user_password']")
    WebElement deleteUserIcon;



    public void createUser() {
        createUser.click();
        userName.sendKeys("taranath");
        phoneNumber.sendKeys("+917892881061");
        role.sendKeys("ProjectOwner");
        submit.click();
    }

    public void createUser(String uName,String pNumber,String roleName) {
        createUser.click();
        userName.sendKeys(uName);
        phoneNumber.sendKeys(pNumber);
        role.sendKeys(roleName);
        submit.click();
    }

    public void deleteUser(String emailId) {
        deleteUserIcon.click();
    }

}
