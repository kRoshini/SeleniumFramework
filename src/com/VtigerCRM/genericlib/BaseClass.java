package com.VtigerCRM.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.CRM.objectRepository.LoginPage;

public abstract class BaseClass {
	public static WebDriver driver;
	FileUtils flib= new FileUtils();
	
		@BeforeClass
		public void configBC()
		{
			System.out.println("Launch Browser");
			Properties pOb= flib.getPropertyFileObject();
			String BROWSER=pOb.getProperty("browser");
			if(BROWSER.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}else if(BROWSER.equals("chrome"))
			{
				System.setProperty("WebDriver.chrome.driver", "./resources/ChromeDriver.exe");
				driver=new ChromeDriver();
			}else if(BROWSER.equals("IE"))
				System.setProperty("WebDriver.chrome.driver", "./resources/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		@BeforeMethod
		public void configBM() throws Throwable
		{
			System.out.println("Login");
			FileInputStream fis = new FileInputStream("./TestData/CommonData.properties");
			Properties pObj= new Properties();
			pObj.load(fis);
			String USER=pObj.getProperty("username");
			String PASSWD=pObj.getProperty("password");
			String URL=pObj.getProperty("url");
			driver.get(URL);
			LoginPage lp= PageFactory.initElements(driver, LoginPage.class);
			
		}
		@AfterMethod
		public void configAM()
		{
			System.out.println("logout");
			WebElement wb2=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
			Actions act = new Actions(driver);
			act.moveToElement(wb2).perform();
			driver.findElement(By.linkText("Sign Out")).click();
			
		}
		@AfterClass
		public void configAC()
		{
			System.out.println("close the Browser");
			driver.quit();
			
		}
		

	}


