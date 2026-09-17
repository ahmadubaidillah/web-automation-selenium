package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    private By errorMessage = By.cssSelector("[data-test='error']");
    private By menuButton = By.id("react-burger-menu-btn");
    private By logoutButton = By.id("logout_sidebar_link");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLogin() {

        driver.findElement(loginButton)
                .click();
    }

    public void login(String username,String password){
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }
    public String getErrorMessage(){
        return driver.findElement(errorMessage).getText();
    }
    public void logout(){
        driver.findElement(menuButton).click();
//        driver.findElement(logoutButton).click();

//        Memberi jeda untuk memastikan button logout sudah muncul
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement logoutBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("logout_sidebar_link")));

        logoutBtn.click();
    }

}
