package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class OrangeHRMLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expurlurl = driver.getCurrentUrl();
		System.out.println(expurlurl);
		String acturl = ("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		System.out.println(acturl.equals(expurlurl));
		System.out.println(driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");

		// driver.close();
	}

}
