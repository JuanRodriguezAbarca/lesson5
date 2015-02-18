

import static org.junit.Assert.assertTrue;
import mavenJenkinsProject.Navigation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runner extends Navigation{
	
	SomeElements elements;
	
	
	@Before
	public void startTesting(){
		getDriver().manage().window().maximize();
		getDriver().get("https://www.google.com/");
		
	}
	
	@After
	public void tearDown(){
		getDriver().quit();
	}
	
	@Test
	public void test1() throws InterruptedException{
		elements.searchTextBox().sendKeys("Hello World");
		elements.searchButton().click();
		Thread.sleep(500);
		String titulo = getDriver().getTitle();
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
	}
	
}
