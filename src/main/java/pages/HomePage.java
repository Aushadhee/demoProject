package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends LoginPage {

    By welcomeNote = By.xpath("//*[contains(text(),'Manger Id : mngr262422')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public  String getHomepageWelcomeNote(){
        return driver.findElement(welcomeNote).getText();
    }

}
