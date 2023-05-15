package com.EXA.Sanity.Cucmber.steps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.EXA.Sanity.Cucumber.base.BaseClass;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass {
	@Given("Enter the username as {string}")
	public Login enter_the_username_as(String uName) {
		WebElement ele = locateElement("username");
		clearAndType(ele, uName);
		reportStep("username entered successfully", "pass");
		return this;
	}

	@Given("Enter the password as {string}")
	public Login enterPassword(String pWord) {
		clearAndType(locateElement("id", "password"), pWord);
		return this;
	}

	@Given("Click Hippa Privacy")
	public Login clickHippa() {
		WebElement hippa = locateElementCss("#chkHipaaPrivacy");
		jsExecutorclick(hippa);
		return this;
	}

	@When("Click on login button")
	public Login clickLogin() {
		WebElement submit = locateElement("btnlogin");
		click(submit);
		return this;
	}

	@Then("Homepage should be displayed")
	public WorklistAcc verifyHomePage() {
		String expTitle = "PACS Home";
		wait.until(ExpectedConditions.elementToBeClickable(locateElement("xpath", "//a[@onclick='ppShow()']")));
		verifyTitle(expTitle);
		return new WorklistAcc();
	}

	@But("Error message should be displayed")
	public Login verifyErrorMessage() {
		WebElement errElem = locateElement("xpath", "//span[text()='User does not exist, is deleted or is inactive']");
		String errMess = locateElement("xpath", "//span[text()='User does not exist, is deleted or is inactive']")
				.getText();
		verifyExactText(errElem, errMess);

		return this;
	}
}
