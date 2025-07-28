package selenium_scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium_Grid {

	public static void main(String[] args) {
		try {
			// Set Chrome Options
			ChromeOptions options = new ChromeOptions();
			options.setPlatformName("Windows"); // Optional based on node setup
			options.setBrowserVersion("130"); // Specify version if needed

			// Remote WebDriver to connect to Selenium Grid Hub
			WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444"), options);

			// Open a website
			driver.get("https://www.google.com");

			// Print title
			System.out.println("Page title is: " + driver.getTitle());

			// Close browser
			driver.close();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
