package org.firecrowd.ProjectMenu;

import PageObjectModel.LoginPage;
import PageObjectModel.ProjectMenu;
import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.firecrowd.businessutil.XLOperationUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CreateProjectE2EUsesCasesSample {
    BrowserSetUpUtil browserSetUpUtil = new BrowserSetUpUtil();
    LoginPage loginPage;
    ProjectMenu projectMenu;
    XLOperationUtil xlOperationUtil;

    //ProjectOwner email and password
    //"emailId": "mehak.h@adtechdf.com",
    // "password": "Password@123"

    //  @BeforeMethod
    public void OpenBrowser() throws InterruptedException {
        browserSetUpUtil.openBrowser();
        loginPage = new LoginPage(browserSetUpUtil.driver);
        loginPage.login("punith.b@testyantra.com", "Password@123");
        Assert.assertEquals(loginPage.checkUserLogin(), true);

    }

    @Test
    public void CreateWebProject_HU1_CDT() throws IOException {
        // projectMenu=new ProjectMenu(browserSetUpUtil.driver);
        // projectMenu.clickCreateProjectButton();
        xlOperationUtil = new XLOperationUtil("C:\\Users\\User\\IdeaProjects\\FireCrowd\\src\\test\\resource\\testdata (1).xlsx");
        String sheetName = "Project Data";
        int totalDataInARow = xlOperationUtil.getCellCount(sheetName, 0);
        int totalColumnInASheet = xlOperationUtil.getRowCount(sheetName);
        for (int i = 1; i < totalColumnInASheet + 1; i++) {
            for (int j = 1; j < totalDataInARow + 1; j++) {
                String Data = xlOperationUtil.getCellData(sheetName, i, j - 1);
            }
        }
    }

    @Test
    public void CreateProject() {

    }

    //  @AfterMethod
    public void CloseBrowser() {
        browserSetUpUtil.closeBrowser();
    }
}
