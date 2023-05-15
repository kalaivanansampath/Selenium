package com.EXA.Sanity.Cucmber.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.EXA.Sanity.Cucumber.base.BaseClass;

import io.cucumber.java.en.Then;

public class WorklistAcc extends BaseClass {
	@Then("Worklist Accountno Exported")
	public WorklistAcc HomePage() {

		// List<WebElement> allRows =
		// getDriver().findElements(By.xpath("//table[@id='tblGrid1']/tbody/tr"));
		List<WebElement> allRows = locateElements("xpath", "//table[@id='tblGrid1']/tbody/tr");
		// List<WebElement> allTds =
		// getDriver().findElements(By.xpath("//table[@id='tblGrid1']/tbody/tr[3]/td[29]"));
		int size = allRows.size();
		System.out.println(size);
		for (int j = 3; j <= allRows.size(); j++) {

			// String text =
			// getDriver().findElement(By.xpath("//table[@id='tblGrid1']/tbody/tr[" + j +
			// "]/td[29]")).getText();
			String text = locateElement("xpath", "//table[@id='tblGrid1']/tbody/tr[" + j + "]/td[29]").getText();

			System.out.println(text);
		}
		return this;
	}
}