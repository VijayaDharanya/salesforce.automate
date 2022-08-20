package automate.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce3 extends BaseClassSalesForce {

	@Test
	public void salesForce3() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Content");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		WebElement js = driver.findElement(By.xpath("//span[text()='Chatter']"));
		((RemoteWebDriver) driver).executeScript("arguments[0].click()", js);
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is  " + actualTitle);
		String expectedTitle = "Lightning Experience";
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Same Title");
		} else {
			System.out.println("Different Title");
		}
		driver.findElement(By.xpath("//span[text()='Question']")).click();
		driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("coming from excel");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("coming from excel");
		driver.findElement(By.xpath("//div[contains(@class,'bottomBarRight')]")).click();
		if (driver.getPageSource().contains("coming from excel")) {
			System.out.println("question appears");
		} else {
			System.out.println("question not appears");
		}

	}
}
