package com.Leaf.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.Color;
public class VerifyColor{
   public static void main(String[] args) {
	   ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
      // identify text
      WebElement t = driver.findElement(By.tagName("h1"));
      //obtain color in rgba
      String s = t.getCssValue("color");
      // convert rgba to hex
      String c = Color.fromString(s).asHex();
      System.out.println("Color is :" + s);
      System.out.println("Hex code for color:" + c);
      driver.quit();
   }
}

