package com.Leaf.Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;
import org.apache.commons.io.FileUtils;

public class WindowHandling {
//	main1. Navigate to https://www.irctc.co.in/
//	2. Click on FLIGHTS link
//	3. Switch to the Flights window
//	4. Take the screenshot of Flights window
//	5. Close the Flights window alone
//	6. Print the Train search window title (First window)
	
	//setTimeout(function(){debugger;},5000);

public static void main(String[] args) throws IOException {
	EdgeDriver driver2 = new EdgeDriver();

	driver2.get("https://www.irctc.co.in/");

	// driver2.manage().timeouts().ImplicitlyWait(Duration.ofSeconds(30));
	driver2.manage().window().maximize();

	driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	String windowHandle1 = driver2.getWindowHandle();

	System.out.println(driver2.getTitle());
	System.out.println("****************************");
	driver2.findElement(By.xpath("//a[text()=\" FLIGHTS \"]")).click();

	// Set<String> setwindowHandles = new LinkedHashSet<String>();
	Set<String> windowHandles2 = driver2.getWindowHandles();

	List<String> listWindowHandles = new ArrayList<String>(windowHandles2);

	System.out.println(listWindowHandles);

	String newWindow = listWindowHandles.get(1);

	driver2.switchTo().window(newWindow);

	File source = driver2.getScreenshotAs(OutputType.FILE);
	File target = new File("./snaps/pageFLight.png");
	FileUtils.copyFile(source, target);

	System.out.println(driver2.getTitle());
	System.out.println("****************************");

	driver2.close();
	
	driver2.switchTo().window(listWindowHandles.get(0));
	
	//File source2 = driver2.getScreenshotAs(OutputType.FILE);
	File target2 = new File("./snaps/pageTrain.png");
	FileUtils.copyFile(source , target2);

	driver2.close();
	
}

}
