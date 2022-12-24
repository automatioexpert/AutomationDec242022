package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest3 {

	@Test
	public void launchTest1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.digchip.com/");
		try {
			if (driver.findElement(By.xpath("//button[@id=\"ts_1_9_9Personalize2\"]")).isDisplayed()) {
				driver.findElement(By.xpath("//button[@id=\"ts_1_9_9Personalize2\"]")).click();
			}
		} catch (Exception e) {
			System.out.println("Exception is caught: "+e.getStackTrace());
		}
		
	driver.findElement(By.cssSelector("a[href*='login']")).click();
	System.out.println(driver.findElement(By.cssSelector("h1.page_login_h1")).isDisplayed());
	driver.findElement(By.cssSelector("input#page_login_username")).sendKeys("User3445457347");
	System.out.println(driver.findElement(By.cssSelector("input#page_login_username")).getAttribute("value"));
	driver.findElement(By.cssSelector("input#page_login_password")).sendKeys("9493493934");
	System.out.println(driver.findElement(By.cssSelector("input#page_login_password")).getAttribute("value"));
	driver.quit();
	}
}
