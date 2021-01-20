package com.FreeCRM.Testcases;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\featurefile",
		glue="com\\FreeCRM\\stepDefination" ,
		strict=true,
		monochrome=true,
		dryRun=false,
		plugin= {"pretty","html:target/cucumber","json:target/cucmber.json","junit:target/ckos.xml"})

public class RunningTestCases {

}
