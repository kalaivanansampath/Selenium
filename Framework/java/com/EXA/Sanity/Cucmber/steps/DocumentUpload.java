package com.EXA.Sanity.Cucmber.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.EXA.Sanity.Cucumber.base.BaseClass;

import io.cucumber.java.en.Then;

public class DocumentUpload extends BaseClass {
	@Then("Worklist Accountno Search")
	public DocumentUpload FileUpload() {
		String FirstAccNo = locateElement("xpath", "//table[@id='tblGrid1']/tbody/tr[3]/td[29]").getText();

		WebElement AccSearch = locateElement("xpath", "//input[@id='gs_account_no']");
		click(AccSearch);
		AccSearch.sendKeys(FirstAccNo);
		AccSearch.sendKeys(Keys.ENTER);

		String FirstSearchAccNo = locateElement("xpath", "//table[@id='tblGrid1']/tbody/tr[3]/td[29]").getText();
		if (FirstAccNo.equals(FirstSearchAccNo)) {
			System.out.println("Search Works");
		}

		return this;
	}

	@Then("Select Attach Files")
	public void AttachFiles() throws InterruptedException {
		System.out.println("Attach Files Method");
		WebElement SelectRecordRC = locateElement("xpath", "//table[@id='tblGrid1']/tbody/tr[2]/td[30]");
		actionsContextClick(SelectRecordRC);

		WebElement AttachDocIcon = locateElement("xpath", "//a[@id='anc_Attach_Files']/span");
		actionsMouseHover(AttachDocIcon);
		click(AttachDocIcon);
		
		//div[@id='patientDocHeader']/div[@class='row']/div/div[@class='btn-group']/button[2]
		//div[@class='btn-group']/button[2]
		WebElement Upload = locateElement("xpath", "//div[@class='btn-group'][2]/button[1]");
		click(Upload);

	}
}
