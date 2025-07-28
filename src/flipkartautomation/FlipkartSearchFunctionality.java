package flipkartautomation;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchFunctionality {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the browser
		driver.manage().window().maximize();
		// Delete cookies
		driver.manage().deleteAllCookies();
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// Load the webpage
		driver.get("https://www.flipkart.com");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("ihone 15 pro max");
		search.submit();

		driver.findElement(By.xpath("//div[normalize-space()='Apple iPhone 15 Pro Max (White Titanium, 1 TB)']"))
				.click();

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		Set<String> allWindowHandles = driver.getWindowHandles();
		// System.out.println(allWindowHandles);
		for (String windowHandle : allWindowHandles)
			// System.out.println(windowHandle);
			if (!windowHandle.equals(parentWindow)) {
				driver.switchTo().window(windowHandle);
				break;

			}
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		List<WebElement> links = driver.findElements(By.className("_7eSDEz"));
		System.out.println(links.size());
		for (WebElement link : links) {
			System.out.println(link.getText());

		}
		driver.findElement(By.xpath("//div[@class='_3GOL67 gTLS5r']")).click();
		Thread.sleep(5000);

		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();
	}

}
