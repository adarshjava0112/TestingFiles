package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Java_programs_BJS\\Automation_Files\\NEWEcalipseFile\\bddDemoTwo\\src\\test\\java\\features\\Testscenario.feature",
                  glue= {"stepdefinitions"},
                  publish=true)
public class TestRunner {

}
