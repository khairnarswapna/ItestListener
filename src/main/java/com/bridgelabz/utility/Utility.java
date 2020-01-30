

package com.bridgelabz.utility;

import com.bridgelabz.base.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility extends BaseClass
{
	/**
	 * for take the screenshot
	 */

	public static void captureScreenShot() throws IOException
	{
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String date =  new SimpleDateFormat("yyyy/MM/dd-hh:mm:ss'.png'").format(new Date());
		File destinationFile = new File("screenshots.png"+date);
		FileUtils.copyFile(sourceFile, destinationFile);
	}

	@AfterMethod()
	public void tearDown()
	{
		driver.close();
	}


}
