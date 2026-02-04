package polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Overriding2 extends Method_Overriding {
	WebDriver driver;

	@Override
	public void LaunchBrowser()

	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.utkarshacademy.com");
		System.out.println("This is Method Overriding");
	}

	public static void main(String[] args) {
		Method_Overriding ovr = new Method_Overriding();
		ovr.LaunchBrowser();

	}

}
