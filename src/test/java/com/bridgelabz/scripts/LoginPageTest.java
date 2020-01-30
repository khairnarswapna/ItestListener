package com.bridgelabz.scripts;

import com.bridgelabz.base.BaseClass;
import com.bridgelabz.pages.LoginPage;
import com.bridgelabz.utility.CustomListener;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class
LoginPageTest extends BaseClass
{
    public LoginPage loginPage;

    @BeforeMethod
    public void setUp()
    {
        initiation();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void LoginTest()
    {
        loginPage.Login(property.getProperty("email"), property.getProperty("password"));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void fail() {
        Assert.assertEquals(false,true);
    }
}

