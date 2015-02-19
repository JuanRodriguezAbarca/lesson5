

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runner{
	
	WebDriver driver = new FirefoxDriver();
	
	
	@Before
	public void startTesting(){
		driver.manage().window().maximize();
		driver.get("https://www.google.es/");
		
	}
	
	@After
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void test1() throws InterruptedException{
		driver.findElement(By.id("gbqfq")).sendKeys("Hello World");
		driver.findElement(By.id("gbqfb")).click();
		Thread.sleep(500);
		String titulo = driver.getTitle();
		System.out.println(titulo+"\nTitle found.");
		assertTrue("Title "+titulo+" is not correct",titulo.contentEquals("Hello World - Buscar con Google"));
		System.out.println("Enough for start playing :)");
				
	}
	
	@Test
	public void test2(){
		System.out.println("New Method implemented And now ran from home");
	}
	
	@Test
	public void mindaDeTest(){
		System.out.println("Test to verify the changes on real time");
		assertTrue("This test should Fail",false);
	}
	
}
