package co.com.choucair.certificacion.retocandidatos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/retoPaolaChoucair.feature",
        tags="@stories",
        glue= "co.com.choucair.certificacion.retocandidatos.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
