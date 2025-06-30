package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WebTable {

	public static void main(String[] args) throws IOException {
		//EdgeDriver driver2 = new EdgeDriver();
		
		 WebDriverManager.chromedriver().setup(); // Automatically downloads & sets path
	        WebDriver driver2 = new ChromeDriver();
	      String Path = "C:/Selenium-TestLeaf/Screenshot/screenshot.png";
	        
	        File src = ((TakesScreenshot) driver2).getScreenshotAs(OutputType.FILE);
	        	

		driver2.get("https://erail.in/");

		driver2.manage().window().maximize();

		//driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver2.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String windowHandle1 = driver2.getWindowHandle();

	

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
		FileUtils.copyFile(src, new File(Path));

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
