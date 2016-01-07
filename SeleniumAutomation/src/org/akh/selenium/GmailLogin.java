package org.akh.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./src/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://mail.google.com");
		driver.findElement(By.id("Email")).sendKeys("YourUsername");
		driver.findElement(By.id("next")).click();
		Sleeper.sleepTight(1000);
		driver.findElement(By.id("Passwd")).sendKeys("YourPassword");
		driver.findElement(By.id("signIn")).click();
		Sleeper.sleepTight(4000);
		driver.findElement(By.cssSelector("span[class='gb_Wa gbii']")).click();
		Sleeper.sleepTight(250);
		driver.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();

	}
}
