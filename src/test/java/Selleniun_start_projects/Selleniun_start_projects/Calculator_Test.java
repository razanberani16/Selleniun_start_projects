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

public class Calculator_Test {
	
	static WebDriver  browser;
	 
	 @Before
	  public void setup() {
		 
		 System.setProperty(
				    "webdriver.gecko.driver",
				    "D:\\Users\\User\\Downloads\\geckodriver.exe"
				);

		      browser = new FirefoxDriver();
		  	  browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			
		      browser.get("https://testpages.eviltester.com/apps/button-calculator/");
		
	  }
	 @Test
		 public void Add_0_plus_6_shouldReturn_6() {		
				browser.findElement(By.id("button00")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button06")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "6";
				assertEquals(Expected,result);				
		}
	 @Test
		public void Add_5_plus_9_shouldReturn_14() {		
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonplus")).click();
				browser.findElement(By.id("button09")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "14";
				assertEquals(Expected,result);				
		}
	 @Test
		public void Subtract_5_minus_2_shouldReturn_3() {		
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button02")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "3";
				assertEquals(Expected,result);				
		}
	 @Test
		public void Subtract_6_minus_8_shouldReturn_Minus2() {		
				browser.findElement(By.id("button06")).click();
				browser.findElement(By.id("buttonminus")).click();
				browser.findElement(By.id("button08")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "-2";
				assertEquals(Expected,result);				
		}
	 @Test
		public void Multiply_5_by_7_shouldReturn_35() {		
				browser.findElement(By.id("button05")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button07")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "35";
				assertEquals(Expected,result);				
		}
	 @Test
		public void Multiply_9_by_0_shouldReturn_0() {		
				browser.findElement(By.id("button09")).click();
				browser.findElement(By.id("buttonmultiply")).click();
				browser.findElement(By.id("button00")).click();
				try {
					  Thread.sleep(1000);
					} catch (InterruptedException e) {
					  Thread.currentThread().interrupt();
					}
				browser.findElement(By.id("buttonequals")).click();
				System.out.println("hello");
				String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
				System.out.println(result);	
				String Expected= "0";
				assertEquals(Expected,result);				
		}

	 
}


