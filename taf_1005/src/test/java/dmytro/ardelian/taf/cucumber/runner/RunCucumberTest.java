package dmytro.ardelian.taf.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",features = "src/test/resources/parkmobile", glue = "pm_steps")
public class RunCucumberTest {
}
