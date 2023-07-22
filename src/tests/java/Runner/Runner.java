package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/tests/java",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
