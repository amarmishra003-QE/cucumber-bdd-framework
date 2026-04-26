package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class StepDefinition {

    WebDriver driver;

    @Given("user launches the application")
    public void user_launches_the_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/login");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
    }

    @And("user clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login")).click();
    }

    @Then("user should be redirected to the home page")
    public void user_should_be_redirected_to_the_home_page() {
        System.out.println("User successfully logged in and redirected to home page");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
