package com.Leaf.Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafSample {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}