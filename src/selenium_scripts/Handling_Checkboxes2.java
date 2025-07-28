package selenium_scripts;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Handling_Checkboxes2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		Thread.sleep(2000);

		WebElement check1 = driver.findElement(By.id("checkBoxOption1"));
		System.out.println(check1.isDisplayed());
		System.out.println(check1.isEnabled());
		System.out.println(check1.isSelected());
		check1.click();
		Thread.sleep(2000);
		System.out.println(check1.isSelected());

		// option2
		WebElement check2 = driver.findElement(By.id("checkBoxOption2"));
		System.out.println(check2.isDisplayed());
		System.out.println(check2.isEnabled());
		System.out.println(check2.isSelected());
		check2.click();
		Thread.sleep(2000);
		System.out.println(check2.isSelected());

		// option3
		WebElement check3 = driver.findElement(By.id("checkBoxOption3"));
		System.out.println(check3.isDisplayed());
		System.out.println(check3.isEnabled());
		System.out.println(check3.isSelected());
		check3.click();
		Thread.sleep(2000);
		System.out.println(check3.isSelected());

		List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 0; i < list.size(); i++) {
			list.get(i).click();
			Thread.sleep(2000);
		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFiles = ts.getScreenshotAs(OutputType.FILE);
		File destFiles = new File("C:\\Users\\Shubham\\Desktop\\SSQUARE\\ScreenShots\\my screenshot1.png");
		Files.copy(srcFiles, destFiles);
		Thread.sleep(2000);
		System.out.println("Screenshot Captured");

		driver.close();
	}

}
