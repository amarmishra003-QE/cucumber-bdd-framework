import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {

    WebDriver driver;

    @Given("user is on homepage")
    public void openHomePage() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.get("https://example.com");
    }

    @When("user checks the page title")
    public void checkTitle() {
        System.out.println("Checking title");
    }

    @Then("title should contain {string}")
    public void validateTitle(String expected) {
        String actual = driver.getTitle();
        if (actual.contains(expected)) {
            System.out.println("BDD Test Passed");
        } else {
            System.out.println("BDD Test Failed");
        }
        driver.quit();
    }
}