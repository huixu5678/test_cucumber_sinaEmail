package com.steps;

import com.method.email;
import com.po.pages.sina_page;
import io.cucumber.java.zh_cn.并且;
import io.cucumber.java.zh_cn.当;
import io.cucumber.java.zh_cn.那么;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class step {
    WebDriver driver;
    @当("^我打开网址$")
    public void opensite(){
        System.out.println("当我打开一个网址");

    }
    @当("^我打开sina网址$")
    public void openweb(){
        System.setProperty("webdriver.gecko.driver", "E:\\eclipse_packages\\java_selenium_qudong\\geckodriver.exe");
        System.setProperty("webdriver.firefox.bin", "D:\\Firefox\\firefox.exe");
        driver=new FirefoxDriver();
        driver.get("https://mail.sina.com.cn");
    }
    @并且("^我用用户名:\"(.*?)\",密码:\"(.*?)\"登录$")
    public void login(String username,String pwd){
        email.loginEmail(driver,username,pwd);
    }
    @并且("^我在email文本框输入\"(.*?)\"$")
    public void sendkeysEmail(String email) {
        System.out.println("我输入了email:"+email);
    }

    @并且("^我在密码框输入\"(.*?)\"$")
    public void sendkeysPass(String password) {
        System.out.println("我输入了password:"+password);
    }

    @当("^我点击登录按钮$")
    public void clickLogin() {
        System.out.println("我点击了登录按钮");
    }

    @那么("^我登录成功$")
    public void loginSuccess() {
        email.clicklogin(driver);
    }

    @那么("^我登录成功2$")
    public void loginSuccess2() {
        System.out.println("登录成功");
    }

    @并且("关闭浏览器")
    public void close(){
        driver.quit();
    }
}
