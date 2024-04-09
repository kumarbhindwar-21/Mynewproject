package com.java.pack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void f() throws IOException {
	  System.out.println("Welome");
	 // WebDriverManager.chromedriver().setup();
	  //WebDriver driver=new ChromeDriver();
	  //WebDriver driver=new FirefoxDriver();
	 // WebDriver driver=new EdgeDriver();
	  WebDriver driver=new InternetExplorerDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.browserstack.com/guide/take-screenshots-in-selenium");
	  
	
	//System.out.println(SeleniumManager.getInstance());
	 TakesScreenshot src= ((TakesScreenshot)driver);
	 File src1=src.getScreenshotAs(OutputType.FILE);
	 File dest=new File("C:\\MyEclipseWorkSpace24\\MyNewProject\\Screenshot\\Jitendra.png");
	 FileUtils.copyFile(src1, dest);
	 
	 
		
		
		}
	
  }

