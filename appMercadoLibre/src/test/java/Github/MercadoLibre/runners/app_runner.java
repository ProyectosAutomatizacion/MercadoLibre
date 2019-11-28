package Github.MercadoLibre.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/",  glue= {"Github.MercadoLibre"}, tags= {"@tag5"})

public class app_runner {
	
}
