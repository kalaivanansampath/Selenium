package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {

		 WebDriverManager.chromedriver().setup(); // Automatically downloads & sets path
	        WebDriver driver2 = new ChromeDriver();
	        
	        driver2.get("http://amazon.in");
	        
	        WebElement search = driver2.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
	        WebElement submit = driver2.findElement(By.xpath("//input[@type=\"submit\"]"));
	        
	        search.click();
	        search.sendKeys("Mobiles");
	        submit.click();
	        
	        WebElement Value = driver2.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
	       String value1=  Value.getText();
	       System.out.println(value1);
	        
	        
	}

}
