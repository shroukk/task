package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private By textField = By.id("textfield");
    private By loginBtn = By.id("text");
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterName(String name){
        driver.findElement(textField).sendKeys(name);
    }
    public void clickBtn(){
        driver.findElement(loginBtn).click();
    }

    public void fill_form(String name){
        enterName(name);
        clickBtn();
    }


}
