package cucumber.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = {"cucumber/steps"},
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-report.html",
                "json:target/json-report.json",
                "junit:target/xml-report.xml"
        }
)
public class FeaturesRunner {
}
