package org.firecrowd.ProjectMenu;

import PageObjectModel.LoginPage;
import PageObjectModel.ProjectMenu;
import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.firecrowd.businessutil.XLOperationUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateProjectE2EUsesCases extends BrowserSetUpUtil{
    Select select;
    Map<Integer, String> projectData = new HashMap<Integer, String>();
    BrowserSetUpUtil browserSetUpUtil = new BrowserSetUpUtil();
    LoginPage loginPage;
    ProjectMenu projectMenu;
    XLOperationUtil xlOperationUtil;

    //ProjectOwner email and password
    //"emailId": "mehak.h@adtechdf.com",
    //"password": "Password@123"

    @BeforeMethod
    public void openBrowser() {

        browserSetUpUtil.openBrowser();
    }

    @Test
    public void createWebProject_HU1_CDT() throws IOException, InterruptedException, AWTException {
        projectMenu = new ProjectMenu(browserSetUpUtil.driver);
        xlOperationUtil = new XLOperationUtil("C:\\Users\\User\\IdeaProjects\\FireCrowd\\src\\test\\resource\\testdata (1).xlsx");
        String sheetName = "Project Data";
        int totalDataInARow = xlOperationUtil.getCellCount(sheetName, 0);
        int totalRowInASheet = xlOperationUtil.getRowCount(sheetName);
        for (int i = 1; i < totalRowInASheet + 1; i++) {
            for (int j = 1; j < totalDataInARow + 1; j++) {
                projectData.put(j, xlOperationUtil.getCellData(sheetName, i, j - 1));
            }
            Thread.sleep(5000);
            projectMenu.clickCreateProjectButton();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectNameLocator()).sendKeys(projectData.get(1));
            browserSetUpUtil.driver.findElement(projectMenu.getProjectDescriptionLocator()).sendKeys(projectData.get(2));
            Robot robot = new Robot();
            Thread.sleep(2000);
            browserSetUpUtil.driver.findElement(projectMenu.getProjectNameLocator()).click();
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_TAB);
            browserSetUpUtil.driver.findElement(projectMenu.getProjectEventDurationLocator()).sendKeys(projectData.get(4));
            browserSetUpUtil.driver.findElement(projectMenu.getProjectNumberOfTesterLocator()).sendKeys(projectData.get(5));
            browserSetUpUtil.driver.findElement(projectMenu.getProjectUNGUIDEDExecutionTypeLocator()).click();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectFUNCTIONALITY_TESTINGLocator()).click();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectEXPLORATORY_TESTINGLocator()).click();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectSOCIABILITY_TESTINGLocator()).click();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectEXPLORATORY_TESTINGLocator()).click();

            browserSetUpUtil.driver.findElement(projectMenu.getProjectWebTypeLocator()).click();
            browserSetUpUtil.driver.findElement(projectMenu.getProjectWebUrlLocator()).sendKeys(projectData.get(6));
            browserSetUpUtil.driver.findElement(projectMenu.getProjectInstructionsLocator()).sendKeys(projectData.get(7));
            WebElement createButton = browserSetUpUtil.driver.findElement(projectMenu.getProjectCreateButtonLocator());

            JavascriptExecutor j = (JavascriptExecutor) browserSetUpUtil.driver;
            j.executeScript("arguments[0].click();", createButton);
            Thread.sleep(5000);
        }
    }


    @AfterMethod
    public void closeBrowser() {
        browserSetUpUtil.closeBrowser();
    }
}
