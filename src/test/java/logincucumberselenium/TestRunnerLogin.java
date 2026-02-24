package logincucumberselenium;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"logincucumberselenium"},
monochrome=true)
public class TestRunnerLogin
{

}



