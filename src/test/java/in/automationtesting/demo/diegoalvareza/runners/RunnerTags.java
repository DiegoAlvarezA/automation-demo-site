package in.automationtesting.demo.diegoalvareza.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/automationDemoSite.feature",
        tags = "@stories",
        glue = "in.automationtesting.demo.diegoalvareza.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
