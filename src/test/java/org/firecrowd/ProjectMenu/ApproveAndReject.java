package org.firecrowd.ProjectMenu;

import PageObjectModel.LoginPage;
import PageObjectModel.ProjectMenu;
import org.firecrowd.businessutil.BrowserSetUpUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApproveAndReject {

    Map<String,String> userEmailWithPasswordToken=new HashMap();
    public static void main(String[] args) throws Exception{
        BrowserSetUpUtil browserSetUpUtil = new BrowserSetUpUtil();
        browserSetUpUtil.openBrowser();
        LoginPage loginPage=new LoginPage(browserSetUpUtil.driver);
        loginPage.login("taranath.r@fireflink.com","Testing@123");
        Thread.sleep(5000);
        browserSetUpUtil.driver.findElement(By.xpath("//div[text()='defects 16 05 2023']")).click();
        Thread.sleep(5000);
        browserSetUpUtil.driver.findElement(By.xpath("//span[text()='Defects']")).click();
        Thread.sleep(5000);
        String[] val = browserSetUpUtil.driver.findElement(By.xpath("//div[text()='Defects List-']")).getText().split("-");
        int approveOrRejectCount = Integer.parseInt(val[1])/2;
//        for(int i=0;i<=approveOrRejectCount;i++){
//            Thread.sleep(5000);
//            browserSetUpUtil.driver.findElement(By.xpath("/HTML/BODY/DIV[1]/DIV/DIV/DIV[2]/DIV[2]/DIV/DIV[3]/TABLE/DIV/TBODY/TR["+(i+6)+"]/TD[7]/DIV/DIV/DIV[1]/*[local-name()='svg']/*[local-name()='g']/*[local-name()='g'][1]/*[local-name()='g']/*[local-name()='rect'][1]       ")).click();
//            Thread.sleep(5000);
//            browserSetUpUtil.driver.findElement(By.xpath("//button[text()='Reject']")).click();
//        }
//        for(int j=0;j<=approveOrRejectCount;j++){
//            Thread.sleep(5000);
//            browserSetUpUtil.driver.findElement(By.xpath("/HTML/BODY/DIV[1]/DIV/DIV/DIV[2]/DIV[2]/DIV/DIV[3]/TABLE/DIV/TBODY/TR["+(j+1)+"]/TD[7]/DIV/DIV/DIV[2]/*[local-name()='svg']/*[local-name()='g']/*[local-name()='g']/*[local-name()='g'][1]/*[local-name()='rect'][1]")).click();
//            Thread.sleep(5000);
//            browserSetUpUtil.driver.findElement(By.xpath("//button[text()='CONFIRM']")).click();
//        }

       // browserSetUpUtil.closeBrowser();
    }





}
