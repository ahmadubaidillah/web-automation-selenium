package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

import static org.junit.jupiter.api.Assertions.*;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    public LoginSteps(){
        driver = DriverFactory.getDriver();
        loginPage = new LoginPage(driver);
    }



    @Given("user membuka halaman login SauceDemo")
    public void userMembukaHalamanLoginSauceDemo() {
        driver.get("https://www.saucedemo.com/");

    }

    @When("user login dengan username {string} dan password {string}")
    public void userLoginDenganUsernameDanPassword(String username, String password) {
        loginPage.login(username, password);
    }

    @Then("user diarahkan ke halaman produk")
    public void userDiarahkanKeHalamanProduk() {
        assertTrue
                (
                driver.getCurrentUrl().contains("/inventory.html")
        );
    }

    @And("judul halaman menampilkan {string}")
    public void judulHalamanMenampilkan(String expectedTitle) {

        String actualTitle = driver.findElement(By.className("title")).getText();
        assertEquals(expectedTitle,actualTitle);
    }

    @Then("muncul pesan error {string}")
    public void munculPesanError(String expectedErrorMessage) {
        assertTrue(loginPage.getErrorMessage().contains(expectedErrorMessage));
    }

    @And("user melakukan logout")
    public void userMelakukanLogout() {
        loginPage.logout();
    }

    @Then("user diarahkan kembali ke halaman login")
    public void userDiarahkanKembaliKeHalamanLogin() {
        assertEquals(
                "https://www.saucedemo.com/",
                driver.getCurrentUrl()
        );
    }
}
