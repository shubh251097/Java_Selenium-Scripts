package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.java.swing.plaf.windows.resources.windows;

public class Handling_MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//div[@class=\"dropdown\"]"));

		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//a[normalize-space()=\"Mobiles\"]"));
		// ele1.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement ele2 = wait.until(ExpectedConditions.elementToBeClickable(ele1));
		ele2.click();

	}

}
