package tech.kefi.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import tech.kefi.base.testBase;

public class TestUtil extends testBase{
	
	 public static String screenshotFileName="error.jpg";
	 public static String screenshotPath="E:\\Automation\\Selenium\\Study_Project_edura_Practice\\PracticeOne\\target";
	 public static String srcShot=screenshotPath+screenshotFileName;
	public static void captureScreenshot() throws IOException {
		
		 File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile , new File(srcShot));		
		}
	
}
