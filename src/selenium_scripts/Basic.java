package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// WebElement searchBar = driver.findElement(By.id("APjFqb"));
		// WebElement searchBar = driver.findElement(By.xpath("//textarea[@name='q']"));
		// driver.findElement(By.linkText("Gmail")).click();

		WebElement search = driver.findElement(By.name("q"));

		boolean b1 = search.isDisplayed();
		boolean b2 = search.isEnabled();
		System.out.println(b1);
		System.out.println(b2);

		Thread.sleep(2000);
		if (search.isDisplayed() && search.isEnabled()) {
			search.sendKeys("India");
			search.submit();

		}

		// searchBar.clear();

		// Thread.sleep(2000);

		// driver.close();

	}

}
