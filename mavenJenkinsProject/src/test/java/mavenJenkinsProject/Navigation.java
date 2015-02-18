package mavenJenkinsProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigation {
	
	public WebDriver getDriver(){
		return new FirefoxDriver();
	}

}
