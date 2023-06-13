import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DropdownDuplicateCheckExample {
    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com"); // Replace with your web page URL

        // Locate the dropdown element
        Select dropdown = new Select(driver.findElement(By.id("dropdownId"))); // Replace "dropdownId" with the actual ID of your dropdown

        // Get all the dropdown options
        List<WebElement> options = dropdown.getOptions();

        // Store the options in a Set
        Set<String> uniqueOptions = new HashSet<>();
        for (WebElement option : options) {
            uniqueOptions.add(option.getText());
        }

        // Compare the counts
        if (uniqueOptions.size() == options.size()) {
            System.out.println("No duplicate values in the dropdown.");
        } else {
            System.out.println("Duplicate values found in the dropdown.");
        }

        // Close the WebDriver
        driver.quit();
    }
}
