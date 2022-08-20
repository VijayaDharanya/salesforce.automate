package automate.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce4 extends BaseClassSalesForce {

	@Test
	public void salesForce4() throws InterruptedException {

		// Type Individuals on the Search box
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Individuals");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("(//div[@class='uiPopupTrigger'])[1]")).click();
		driver.findElement(By.xpath("//a[@title='Mrs.']")).click();
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("N");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Customers");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[text()='New'])[1]")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("N");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'primaryLabel')])[1]")).click();
		if (driver.getPageSource().contains("N")) {
			System.out.println("Same name appears");
		} else {
			System.out.println("Same name not appears");
		}

	}

}
