package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By userName = By.name("uid");
    By password = By.name("password");
    By loginButton = By.name("btnLogin");
    By resetButton = By.name("btnReset");
    By header = By.xpath("//h2[@class='barone']");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUserName(String uName){
        driver.findElement(userName).sendKeys(uName);
    }
    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    public void clickLogin(){
        driver.findElement(loginButton).click();
    }
    public String getLoginTitle(){
       return driver.findElement(header).getText();
    }

    public void login(String user, String pass){
        this.setUserName(user);
        this.setPassword(pass);
        this.clickLogin();
    }
}
