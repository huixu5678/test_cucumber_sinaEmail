package com.method;

import com.po.pages.sina_page;
import org.openqa.selenium.WebDriver;

public class email {
    public static void loginEmail(WebDriver driver, String username, String pwd)  {

      driver.findElement(sina_page.usernameInput).sendKeys(username);
      driver.findElement(sina_page.pwdInput).sendKeys(pwd);

    }
    public static void clicklogin(WebDriver driver) {
        driver.findElement(sina_page.loginButton).click();
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
