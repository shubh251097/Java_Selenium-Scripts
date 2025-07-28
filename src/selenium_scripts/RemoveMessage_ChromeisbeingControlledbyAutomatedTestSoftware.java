package selenium_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class RemoveMessage_ChromeisbeingControlledbyAutomatedTestSoftware {

	public static void main(String[] args) throws InterruptedException, IOException {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFiles = ts.getScreenshotAs(OutputType.FILE);
		File destFiles = new File("C:\\Users\\Shubham\\Desktop\\SSQUARE\\ScreenShots\\my screenshot.png");
		Files.copy(srcFiles, destFiles);
		Thread.sleep(2000);
		System.out.println("Screenshot Captured");

	}

}
