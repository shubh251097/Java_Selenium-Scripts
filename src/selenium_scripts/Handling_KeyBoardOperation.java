package selenium_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_KeyBoardOperation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		Thread.sleep(2000);
		// SendKeys
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("pass123@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Pass@123");
		WebElement ele1 = driver.findElement(By.xpath("//input[@value=\"Login\"]"));
		// Keys.ENTER
		ele1.sendKeys(Keys.ENTER);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.get("https://omayo.blogspot.com/");
		WebElement txtbox1 = driver.findElement(By.xpath("//h2[text()=\"Text Area Field Two\"]/following::textarea"));
		txtbox1.sendKeys(Keys.CONTROL + "A");
		Thread.sleep(2000);
		txtbox1.sendKeys(Keys.CONTROL + "X");
		Thread.sleep(3000);
		WebElement txtbox2 = driver.findElement(By.id("ta1"));

		txtbox2.sendKeys(Keys.CONTROL + "V");
		Thread.sleep(3000);

		Actions action = new Actions(driver);
		WebElement link1 = driver.findElement(By.linkText("compendiumdev"));
		WebElement link2 = driver.findElement(By.linkText("onlytestingblog"));
		WebElement link3 = driver.findElement(By.linkText("testwisely"));
		action.moveToElement(link1).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		action.moveToElement(link2).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
		action.moveToElement(link3).keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();

	}

}
