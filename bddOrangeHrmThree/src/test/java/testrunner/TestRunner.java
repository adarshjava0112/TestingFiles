package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Java_programs_BJS\\Automation_Files\\NEWEcalipseFile\\bddOrangeHrmThree\\src\\test\\java\\features\\testscenario.feature",
                 glue= {"stepdefinitions"},publish=true)
public class TestRunner {

}
