package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttribute {
	static WebDriver driver;
public static void main (String args[])
{
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("boost");
}
}
