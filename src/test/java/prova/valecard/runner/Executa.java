package prova.valecard.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/resources/features",
		glue = "prova.valecard.steps",
		tags = "@tag",
		plugin = {"pretty", "json:target/cucumber-report.json", "html:target/cucumber-report.json"},
		dryRun = false,
		monochrome = true
		
		
		)

public class Executa {

}
