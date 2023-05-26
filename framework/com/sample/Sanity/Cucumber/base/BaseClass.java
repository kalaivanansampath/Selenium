package com.EXA.Sanity.Cucumber.base;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.EXA.Sanity.selenium.api.base.SeleniumBase;
import com.EXA.Sanity.Cucumber.utils.ReadExcelData;

public class BaseClass extends SeleniumBase {

	public String dataSheetName;

	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return ReadExcelData.readExcelData(dataSheetName);
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("chrome", "http://192.168.1.23/login");
		node = test.createNode(testCaseName);
		click(locateElement("details-button"));
		click(locateElement("proceed-link"));

	}

	@AfterMethod
	public void postCondition() {
//		WebElement logoff = locateElement("xpath", "//a[@onclick='commonjs.logOutConfirmation()']/i");
//		click(logoff);
		close();
	}

}
