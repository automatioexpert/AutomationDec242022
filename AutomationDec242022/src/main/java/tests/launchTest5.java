package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest5 {

	@Test
	public void launchTest1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.digchip.com/datasheets/members_login.php");
		try {
			if (driver.findElement(By.xpath("//button[@id=\"ts_1_9_9Personalize2\"]")).isDisplayed()) {
				driver.findElement(By.xpath("//button[@id=\"ts_1_9_9Personalize2\"]")).click();
			}
		} catch (Exception e) {
			System.out.println("Exception is caught: " + e.getStackTrace());
		}

		driver.findElement(By.xpath("//a[contains(text(),'Buy / Find supplier')]")).click();
		driver.findElement(By.cssSelector("input[name='pn']")).sendKeys("3434734374");
		System.out.println(driver.findElement(By.cssSelector("button[type='submit']")).getText());
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.quit();
	}
}
