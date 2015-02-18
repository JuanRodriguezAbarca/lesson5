import mavenJenkinsProject.Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class SomeElements extends Navigation{
	
	public WebElement searchTextBox(){
		return getDriver().findElement(By.id("gbqfq"));
	}
	
	public WebElement searchButton(){
		return getDriver().findElement(By.id("gbqfb"));
	}
}
