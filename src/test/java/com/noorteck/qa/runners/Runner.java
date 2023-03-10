package com.noorteck.qa.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
					features = "src/test/resources/hr/US100-CreateNewEmployee.feature",
					glue = "com.noorteck.qa.steps",					
							plugin = {"summary","pretty", "html:target/cucumber-reports.html",
									"json:target/cucumber-reports.json",					
									"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
					monochrome = true
						)
public class Runner {

}
