package com.adact.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adacin\\feature" ,
				glue = "com\\adact\\stepdefinition",
				monochrome = true,
				dryRun = false,
				plugin = {"html:Reports/Html_Report",
						"pretty",
						"json:Reports/Json_Report.json"}) 
				//		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"})

public class RunnerClass {
	
	public static WebDriver driver; // null
	
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram kumar\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
    @AfterClass
	public static void tearDown() {
    	
    	driver.close();
		
	}
}
