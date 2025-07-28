package selenium_scripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Running_Script_In_IncognitoMode {

	public static void main(String[] args) throws InterruptedException, IOException {

		// System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubham\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());

		WebElement element = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(element);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("This is Frame 1");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		WebElement element2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(element2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("This is Frame 2");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		WebElement element3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(element3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("This is Frame 3");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();

		Thread.sleep(2000);
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("This is Frame 4");
		Thread.sleep(2000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFiles = ts.getScreenshotAs(OutputType.FILE);
		File destFiles = new File("C:\\Users\\Shubham\\Desktop\\SSQUARE\\ScreenShots\\my screenshot15.png");
		Files.copy(srcFiles, destFiles);
		Thread.sleep(2000);
		System.out.println("Screenshot Captured");

	}

}
