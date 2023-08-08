package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProjectMenu {
    private WebDriver driver;

    private By projectListTitleLocator = By.xpath("//span[text()='Projects']");
    private By addProjectLocator = By.xpath("//span[text()='Create Project']");
    private By projectNameLocator = By.id("projectName");
    private By projectDescriptionLocator = By.id("projectDesc");
    DateFormat dateFormat=new SimpleDateFormat("dd");
    Date date=new Date();
    String currentDate = dateFormat.format(date);
    private By projectEventStartDateLocator = By.xpath("//div[text()='"+currentDate+"']");
    private By projectEventDurationLocator = By.id("duration");
    private By projectNumberOfTesterLocator = By.id("numberOfTesters");
    private By projectGUIDEDExecutionTypeLocator = By.xpath("//input[@name='GUIDED']");
    private By projectUNGUIDEDExecutionTypeLocator = By.xpath("//input[@name='UNGUIDED']");

    private By projectFUNCTIONALITY_TESTINGLocator = By.xpath("//input[@name='FUNCTIONALITY_TESTING']");
    private By projectUSABILITY_TESTINGLocator = By.xpath("//input[@name='USABILITY_TESTING']");
    private By projectACCESSIBILITY_TESTINGLocator = By.xpath("//input[@name='ACCESSIBILITY_TESTING']");
    private By projectEND_TO_END_TESTINGLocator = By.xpath("//input[@name='END_TO_END_TESTING']");
    private By projectEXPLORATORY_TESTINGLocator = By.xpath("//input[@name='EXPLORATORY_TESTING']");
    private By projectCOMPATIBILITY_TESTINGLocator = By.xpath("//input[@name='COMPATIBILITY_TESTING']");
    private By projectSOCIABILITY_TESTINGLocator = By.xpath("//input[@name='SOCIABILITY_TESTING']");
    private By projectINTEGRATION_TESTINGLocator = By.xpath("//input[@name='INTEGRATION_TESTING']");


    private By projectWebTypeLocator = By.xpath("//input[@name='web']");
    private By projectWebUrlLocator = By.id("webUrl");

    private By projectMobileTypeLocator = By.xpath("//input[@name='mobile']");
    private By projectMobileAppTypeNativeLocator = By.xpath("//input[@name='appType' and @value='Native']");
    private By projectMobileAppTypeHybridLocator = By.xpath("//input[@name='appType' and @value='Hybrid']");

    private By projectMobileplatformTypeAndroidLocator = By.xpath("//input[@name='platformType' and @value='Android']");
    private By projectMobileplatformTypeiOSLocator = By.xpath("//input[@name='platformType' and @value='iOS']");
    private By projectMobileplatformTypeAndroidAndiOSLocator = By.xpath("//input[@name='platformType' and @value='Android & iOS']");

    private By projectInstructionsLocator = By.id("instructions");
    private By projectSupportingDocumentsLocator = By.xpath("//*[local-name()='svg' and @data-testid='AttachFileSharpIcon']/*[local-name()='path']");

    private By projectCreateButtonLocator = By.id("createBatch");
    private By projectCancelButtonLocator = By.xpath("//button[text()='Cancel']");

    private By projectWebAndMobileTypeLocator = By.xpath("//input[@name='webAndMobile']");
    private By projectOtherTypeLocator = By.xpath("//input[@name='others']");

    public ProjectMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCreateProjectButton() {
        WebElement loginButton = driver.findElement(addProjectLocator);
        loginButton.click();
    }

    public By getProjectListTitleLocator() {
        return projectListTitleLocator;
    }

    public By getAddProjectLocator() {
        return addProjectLocator;
    }

    public By getProjectNameLocator() {
        return projectNameLocator;
    }

    public By getProjectDescriptionLocator() {
        return projectDescriptionLocator;
    }

    public By getProjectEventStartDateLocator() {
        return projectEventStartDateLocator;
    }

    public By getProjectEventDurationLocator() {
        return projectEventDurationLocator;
    }

    public By getProjectNumberOfTesterLocator() {
        return projectNumberOfTesterLocator;
    }

    public By getProjectGUIDEDExecutionTypeLocator() {
        return projectGUIDEDExecutionTypeLocator;
    }

    public By getProjectUNGUIDEDExecutionTypeLocator() {
        return projectUNGUIDEDExecutionTypeLocator;
    }

    public By getProjectFUNCTIONALITY_TESTINGLocator() {
        return projectFUNCTIONALITY_TESTINGLocator;
    }

    public By getProjectUSABILITY_TESTINGLocator() {
        return projectUSABILITY_TESTINGLocator;
    }

    public By getProjectACCESSIBILITY_TESTINGLocator() {
        return projectACCESSIBILITY_TESTINGLocator;
    }

    public By getProjectEND_TO_END_TESTINGLocator() {
        return projectEND_TO_END_TESTINGLocator;
    }

    public By getProjectEXPLORATORY_TESTINGLocator() {
        return projectEXPLORATORY_TESTINGLocator;
    }

    public By getProjectCOMPATIBILITY_TESTINGLocator() {
        return projectCOMPATIBILITY_TESTINGLocator;
    }

    public By getProjectSOCIABILITY_TESTINGLocator() {
        return projectSOCIABILITY_TESTINGLocator;
    }

    public By getProjectINTEGRATION_TESTINGLocator() {
        return projectINTEGRATION_TESTINGLocator;
    }

    public By getProjectWebTypeLocator() {
        return projectWebTypeLocator;
    }

    public By getProjectWebUrlLocator() {
        return projectWebUrlLocator;
    }

    public By getProjectMobileTypeLocator() {
        return projectMobileTypeLocator;
    }

    public By getProjectMobileAppTypeNativeLocator() {
        return projectMobileAppTypeNativeLocator;
    }

    public By getProjectMobileAppTypeHybridLocator() {
        return projectMobileAppTypeHybridLocator;
    }

    public By getProjectMobileplatformTypeAndroidLocator() {
        return projectMobileplatformTypeAndroidLocator;
    }

    public By getProjectMobileplatformTypeiOSLocator() {
        return projectMobileplatformTypeiOSLocator;
    }

    public By getProjectMobileplatformTypeAndroidAndiOSLocator() {
        return projectMobileplatformTypeAndroidAndiOSLocator;
    }

    public By getProjectInstructionsLocator() {
        return projectInstructionsLocator;
    }

    public By getProjectSupportingDocumentsLocator() {
        return projectSupportingDocumentsLocator;
    }

    public By getProjectCreateButtonLocator() {
        return projectCreateButtonLocator;
    }

    public By getProjectCancelButtonLocator() {
        return projectCancelButtonLocator;
    }

    public By getProjectWebAndMobileTypeLocator() {
        return projectWebAndMobileTypeLocator;
    }

    public By getProjectOtherTypeLocator() {
        return projectOtherTypeLocator;
    }
}
