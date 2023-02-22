package tech.kefi.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import tech.kefi.utilities.TestUtil;

public class testBase {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties config;
	public static Properties OR;
	public static TestUtil testUtil;
		
	@BeforeSuite
	public void setUp() throws IOException {
		driver=WebDriverManager.chromedriver().create();
		
		config=new Properties();
		fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
		config.load(fis);
		
		TestUtil testUtil=new TestUtil();
	}
	
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
