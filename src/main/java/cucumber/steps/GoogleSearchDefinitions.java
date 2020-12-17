package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class GoogleSearchDefinitions {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage()
                .timeouts()
                .implicitlyWait(Duration.of(20, ChronoUnit.SECONDS));
        driver.manage()
                .timeouts()
                .pageLoadTimeout(Duration.of(20, ChronoUnit.SECONDS));
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.navigate().to("https://google.com");
    }

    @When("user enters search key")
    public void user_enters_search_key() {
        driver.findElement(By.name("q")).sendKeys("java brains");
    }

    @And("hit enter")
    public void hit_enter() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("verify search results")
    public void verify_search_results() {
        driver.getPageSource().contains("Java Brains - YouTube");
        driver.close();
        driver.quit();
    }
}
