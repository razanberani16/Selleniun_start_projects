package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Password_Test {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty(
				    "webdriver.gecko.driver",
				    "D:\\Users\\User\\Downloads\\geckodriver.exe"
				);

		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/apps/7-char-val/");	      
		}
	 @Test
	 public void ValidPassword() {
		 browser.findElement(By.name("characters")).clear();
		 browser.findElement(By.name("characters")).sendKeys("Razan16");
		 browser.findElement(By.name("validate")).click();
		 String result =browser.findElement(By.name("validation_message")).getAttribute("value");
		 String expected = "Valid Value";
		 assertEquals(expected, result);
	 }
	 @Test
	 public void InValidPassword_6Chars() {
		 browser.findElement(By.name("characters")).clear();
		 browser.findElement(By.name("characters")).sendKeys("Razan6");
		 browser.findElement(By.name("validate")).click();
		 String result =browser.findElement(By.name("validation_message")).getAttribute("value");
		 String expected = "Invalid Value";
		 assertEquals(expected, result);
	 }
	 @Test
	 public void InValidPassword_9Chars() {
		 browser.findElement(By.name("characters")).clear();
		 browser.findElement(By.name("characters")).sendKeys("Razan1611");
		 browser.findElement(By.name("validate")).click();
		 String result =browser.findElement(By.name("validation_message")).getAttribute("value");
		 String expected = "Invalid Value";
		 assertEquals(expected, result);
	 }
	 @Test
	 public void InValidPassword_IncludesInValidChar() {
		 browser.findElement(By.name("characters")).clear();
		 browser.findElement(By.name("characters")).sendKeys("Razan6#");
		 browser.findElement(By.name("validate")).click();
		 String result =browser.findElement(By.name("validation_message")).getAttribute("value");
		 String expected = "Invalid Value";
		 assertEquals(expected, result);
	 }
	 
}
