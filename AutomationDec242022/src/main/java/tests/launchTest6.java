package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchTest6 {

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

		List<WebElement> tags=driver.findElements(By.tagName("a"));
		for(WebElement tag:tags) {
			System.out.println(tag.getText());
		}
		driver.quit();
	
	}
}
