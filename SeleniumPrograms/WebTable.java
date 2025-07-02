package com.Leaf.Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WebTable {

	public static void main(String[] args) {
		EdgeDriver driver2 = new EdgeDriver();
		WebDriver driver = new ChromeDriver();

		driver2.get("https://erail.in/");

		// driver2.manage().timeouts().ImplicitlyWait(Duration.ofSeconds(30));
		driver2.manage().window().maximize();

		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		String windowHandle1 = driver2.getWindowHandle();

		// input[@id='chkSelectFromOnly']

		WebElement stationFrom = driver2.findElement(By.xpath("//input[@id='txtStationFrom']"));
		stationFrom.clear();
		stationFrom.click();
		stationFrom.sendKeys("MS");
		stationFrom.sendKeys(Keys.TAB);

		WebElement stationTo = driver2.findElement(By.xpath("//input[@id='txtStationTo']"));
		stationTo.clear();
		stationTo.click();
		stationTo.sendKeys("MDU");
		stationTo.sendKeys(Keys.TAB);

		driver2.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();

		// table[@class= 'DataTable TrainList TrainListHeader
		// stickyTrainListHeader']/following::tbody/tr[2]/td[2]

		WebElement tableText = driver2.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[2]/td[2]"));

		List<WebElement> findRows = driver2.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr"));

		Set<String> unique = new LinkedHashSet<String>();

		for (int i = 2; i <= findRows.size(); i++) {

			String rowValue = driver2
					.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[" + i + "]/td[2]")).getText();

			System.out.println(rowValue);

			if (!(unique.add(rowValue))) {
				System.out.println("Duplicate available");
			}
		}

	}

}
