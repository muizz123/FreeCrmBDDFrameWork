package Testcases;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:\\muizz\\FreeCRMCucumberFramWork\\src\\test\\java\\com\\FreeCRM\\featurefile",
		glue="com\\FreeCRM\\stepDefination" ,
		strict=true,
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target/cucumber","json:target/cucmber.json","junit:target/ckos.xml"})

public class RunningTestCases {

}
