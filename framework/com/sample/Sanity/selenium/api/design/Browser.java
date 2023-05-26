package com.EXA.Sanity.selenium.api.design;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface Browser {
	
	/**
	 * This method will launch the Chrome browser and 
	 * maximise the browser and set the wait for 30 seconds 
	 * and load the url
	 * @param url - This will load the specified url  
	 * @author Kalai - EMD
	 * @return 
	 * @throws MalformedURLException 
	 */	
	public RemoteWebDriver startApp(String url);
	
	/**
	 * This method will launch the Any browser and 
	 * maximise the browser and set the wait for 30 seconds 
	 * and load the url
	 * @param browser - This will load the specified browser
	 * @param url - This will load the specified url  
	 * @author Kalai - EMD
	 * @return 
	 * @throws MalformedURLException 
	 */
	public RemoteWebDriver startApp(String browser, String url);
	/**
	 * This method will locate the element using any given locator
	 * @param locatorType  - The locator by which the element to be found
	 * @param locValue - The locator value by which the element to be found
	 * @author Kalai - EMD
	 * @throws NoSuchElementException
	 * @return The first matching element on the current context.
	 */
	public WebElement locateElement(String locatorType, String value);	
	
	/**
	 * This method will locate the element using id
	 * @param locValue - The locator value by which the element to be found
	 * @author Kalai - EMD
	 * @throws NoSuchElementException
	 * @return The first matching element on the current context.
	 */
	public WebElement locateElement(String value);
	
	/**
	 * This method will locates all matching element using any given locator
	 * @param locatorType  - The locator by which the element to be found
	 * @param locValue - The locator value by which the element to be found
	 * @author Kalai - EMD
	 * @return A list of all WebElements, or an empty list if nothing matches.
	 */
	public List<WebElement> locateElements(String type, String value);	
	
	/**
	 * This method will switch to the Alert
	 * @author Kalai - EMD
	 * @return NoAlertPresentException
	 */
	public void switchToAlert();
	/**
	 * This method will accept the alert opened
	 * @author Kalai - EMD
	 * @throws NoAlertPresentException
	 */
	public void acceptAlert();
	
	/**
	 * This method will dismiss the alert opened
	 * @author Kalai - EMD
	 * @throws NoAlertPresentException
	 */
	public void dismissAlert();
	
	/**
	 * This method will return the text of the alert
	 * @author Kalai - EMD
	 * @throws NoAlertPresentException
	 */
	public String getAlertText();

	/**
	 * This method will enter the value in the alert
	 * @author Kalai - EMD
	 * @param data- the data to be entered in alert
	 * @throws NoAlertPresentException
	*/
	public void typeAlert(String data);
	
	/**
	 * This method will switch to the Window of interest
	 * @param index The window index to be switched to. 0 -> first window 
	 * @author Kalai - EMD
	 * @throws NoSuchWindowException
	 */
	public void switchToWindow(int index);
	
	/**
	 * This method will switch to the Window of interest using its title
	 * @param title The window title to be switched to first window 
	 * @author Kalai - EMD
	 * @throws NoSuchWindowException
	 */
	public void switchToWindow(String title);
	
	/**
	 * This method will switch to the specific frame using index
	 * @param index   - The int (frame) to be switched
	 * @author Kalai - EMD
	 * @throws NoSuchFrameException 
	 */
	public void switchToFrame(int index);	
	
	/**
	 * This method will switch to the specific frame
	 * @param ele   - The Webelement (frame) to be switched
	 * @author Kalai - EMD
	 * @throws NoSuchFrameException, StaleElementReferenceException 
	 */
	public void switchToFrame(WebElement ele);

	/**
	 * This method will switch to the specific frame using Id (or) Name
	 * @param idOrName   - The String (frame) to be switched
	 * @author Kalai - EMD
	 * @throws NoSuchFrameException 
	 */
	public void switchToFrame(String idOrName);
	
	/**
	 * This method will switch to the first frame on the page
	 * @author Kalai - EMD
	 * @return This driver focused on the top window/first frame.
	 */
	public void defaultContent();
	
	/**
	 * This method will verify browser actual url with expected
	 * @param url   - The url to be checked
	 * @author Kalai - EMD
	 * @return true if the given object represents a String equivalent to this url, false otherwise
	 */
	public boolean verifyUrl(String url);
	
	/**
	 * This method will verify browser actual title with expected
	 * @param title - The expected title of the browser
	 * @author Kalai - EMD
	 * @return true if the given object represents a String equivalent to this title, false otherwise
	 */
	public boolean verifyTitle(String title);
	
	/**
	 * This method will take snapshot of the browser
	 * @author Kalai - EMD
	 * @return Object in which is stored information about the screenshot.
	 * @throws WebDriverException
	 */
	
	/**
	 * This method will close the active browser
	 * @author Kalai - EMD
	 */
	public void close();
	
	/**
	 * This method will close all the browsers
	 * @author Kalai - EMD
	 */
	public void quit();

	public WebElement locateElementCss(String value);

	public WebElement jsExecutorclick(WebElement hippa);
	/**
	 * This method will be used for Js executor
	 * @author Kalai - EMD
	 */
	
	
	
	

	
}
