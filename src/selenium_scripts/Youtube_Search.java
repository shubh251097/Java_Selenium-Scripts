package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.youtube.com");
		WebElement search = driver.findElement(By.xpath("//input[@name='search_query']"));
		search.sendKeys("salaar bgm");
		search.sendKeys(Keys.ENTER);
		// search.submit();

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		driver.findElement(By.xpath(
				"//a[@class='yt-simple-endpoint style-scope ytd-video-renderer' and @title=\"Sound of Salaar | Music By Ravi Basrur | Hombale Films\"]"))
				.click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		// driver.close();

	}

}
