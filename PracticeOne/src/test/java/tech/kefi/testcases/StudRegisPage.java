package tech.kefi.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import tech.kefi.base.testBase;
import tech.kefi.utilities.TestUtil;

public class StudRegisPage extends testBase {

	@Test
	public void loadUrl() throws IOException {

		driver.get(config.getProperty("url"));
		Assert.assertFalse((driver.getTitle()).equals("Demo Web"), "Student registration page load failure !!!");

		Reporter.log("Test success");

	}
}
