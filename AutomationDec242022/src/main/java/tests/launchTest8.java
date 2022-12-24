package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest8 {

	@Test
	public void launchTest1() throws InterruptedException {
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

	driver.findElement(By.cssSelector("a[href*='register']")).click();
	driver.findElement(By.cssSelector("input#lastname")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#firstname")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#adress")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#city")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#postalcode")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#email")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input#tel")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input[name='companyname']")).sendKeys("Steve384");
	driver.findElement(By.cssSelector("input[name='check_agreement']")).click();
	Thread.sleep(1500);
	driver.findElement(By.cssSelector("button#submit_form_register")).click();
	System.out.println("Test Cases Passed");
		
	}
}
