package com.EXA.Sanity.Cucumber.runner;

import org.testng.annotations.BeforeTest;

import com.EXA.Sanity.Cucmber.steps.Login;
import com.EXA.Sanity.Cucumber.base.BaseClass;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "features/EXA03_DocumentUpload.feature", glue = "com.EXA.Sanity.Cucmber.steps", monochrome = true, publish = true,
// tags = "@regression" //only regression testcases
// tags = "@smoke or @functional" //scenarios having either @smoke or
// @functional are eligible
// tags = "@smoke and @functional" //scenarios having both @smoke & @functional
// tags = "not @smoke" //to execute all the testcases except @smoke
		tags = "@login")
public class RunnerClass extends BaseClass{
	@BeforeTest
	public void setValues() {
		testCaseName = "Login and verify using cucumber";
		testDescription = "Login testCase using positive data using cucumber";
		nodes = "Login";
		authors = "KalaiVanan";
		category = "Smoke";
		dataSheetName = "TC001a";
	}
}
