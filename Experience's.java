public void click(WebElement ele) {
		String text = "";
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			reportStep("The Element " + text + " clicked", "pass");
		} catch (StaleElementReferenceException e) {
			reportStep("The Element " + text + " could not be clicked", "fail");
			throw new RuntimeException();
		}
	}


What are Oops concept used in ur project
-- Polymorphism
-- Interface
-- Abstraction
-- Inhertiance

Explain framrwork
Cucumber
	--Cucumber Framework in Selenium is an open-source testing framework that supports Behavior Driven Development for automation testing of web applications. The tests are first written in a simple scenario form that describes the expected behavior of the system from the user's perspective

Dryrun usage
	-- Cucumber dry run is used for compilation of the Step Definition and Feature files and to verify the compilation errors.

Scenario outline with example
When give single parameter do we need pipeline
How will you group testcase for sanity, regression
Page factory usage
What is framework

Benefits of page object modal
	Ease of code maintenance.
	Code Reusability across tests.
	Enhanced script readability and reliability.
	Decouples your test code and page-specific code, such as locators and interactions.

Hook methods
@Before and @After

What is hook
Hooks are blocks of code that run before or after each scenario in the Cucumber execution cycle

Monochrome usage
When monochrome value set to true, It will make console output for the Cucumber test much more readable and remove any unreadable character. 

Selenium


How to handle window
	String windowHandle1 = driver2.getWindowHandle();
	Set<String> windowHandles2 = driver2.getWindowHandles();

	List<String> listWindowHandles = new ArrayList<String>(windowHandles2);

	System.out.println(listWindowHandles);

	String newWindow = listWindowHandles.get(1);

	driver2.switchTo().window(newWindow);
	
Frames
--HTML inside HTML
--HTML document embedded inside another HTML document

What is frame tag
<frame>, <iframe>

How to find all broken links

How to find all links in web page

	-- Using anchor Tag<a>

How to take screenhots
	getScreenshotsAs
	File source = driver2.getScreenshotAs(OutputType.FILE);
	File target = new File("./snaps/pageFLight.png");
	FileUtils.copyFile(source, target);

Possible way to upload a file ( 
 -- sendkeys and robot class?

2 usages of action class
	MouseHover
	Move toElement
	Drag and Drop
	Rightclick

2 usage of Javascript executor
--	JavaScriptExecutor is an interface
--	JavascriptExecutor Provides Two Methods:

--	ExecuteScript
--	ExecuteAsyncScript
	
--	js.executeScript("arguments[0].click();", java);

2 usage of robot lass
-- To upload files
-- To perform key and Mouse actions

Possible way to send text( sendkeys, Javascript executor)
-- Sendkeys, Java script executor

What is webdriver driver=new chrome driver()


How to verify webelements



How to verify button color
//obtain color in rgba
      String s = t.getCssValue("color");
      // convert rgba to hex
      String c = Color.fromString(s).asHex();
      System.out.println("Color is :" + s);
      System.out.println("Hex code for color:" + c);
 -- https://github.com/kalaivanansampath/Selenium/blob/main/SeleniumPrograms/VerifyColor.java


How to Handle SSL Certificate Errors in Selenium?
ChromeOptions options = new ChromeOptions();
options.setAcceptinsecureCerts(true);
