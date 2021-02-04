package com.qe.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qe.qa.base.TestBase;
import com.qe.qa.util.TestUtils;
import com.quote.qa.pages.GetQuote;

public class GetQuoteTest extends TestBase {

	GetQuote getQuote;

	public GetQuoteTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();
		getQuote = new GetQuote();
	}

	@Test(enabled = true)
	public void GetQuoteDl() {

		boolean b = true;
		try {

			b = getQuote.GetQuoteDl();

		} catch (Exception e) {

			// TestUtil.sendEmail("");
		}

		if (b)
			TestUtils.sendEmail(
					"SUCCESS. Getting quote with PublicData test got passed",
					"SUCCESS - GetQuote w/ PublicData :)");
		else
			TestUtils.sendEmail(
					"FAILED. Getting quote with PublicData test got failed, but I'm checking immediately",
					"FAILED - GetQuote w/ PublicData :/"
					);

	}

	@Test(enabled = true)
	public void getQuoteManual() {

		boolean b = true;
		try {

			b = getQuote.getQuoteManual();

		} catch (Exception e) {

			// TestUtil.sendEmail("GetQuote Failed with PublicData mode 11");
		}

		if (b)
			TestUtils.sendEmail( "SUCCESS - GetQuote w/ Manual input :)",
					"SUCCESS. Getting quote with manual input test got passed");
		else
			TestUtils.sendEmail("FAILED - GetQuote w/ Manual input :/",
					"FAILED. Getting quote with manual input test got failed, but I'm checking immediately"
					);

	}

	@Test(enabled = true)
	public void getTitleRateEngine() {

		String actualTitle = driver.getTitle();
		System.out.println("Page Title :" + actualTitle);

		String expectedTitle = "A-MAX Auto Insurance";
		String descr = "";

		boolean b = true;
		try {

			Assert.assertEquals(actualTitle, expectedTitle);

		} catch (Exception e) {

			// TestUtil.sendEmail("");
			descr = "Title mismatched...";
			b = false;
		}

		if (b)
			TestUtils.sendEmail(
					"SUCCESS.A-max Quote Engine UP and Running test got passed.",
					"SUCCESS - A-max Quote Engine is Up and Running :)"
					
					);
		else
			TestUtils.sendEmail(
					"FAILED. A-max Quote Engine UP and Running test got failed, but I'm checking immediately...!!",
					"FAILED - A-max Quote Enginegot failed:/"
					);

	}

	@Test(enabled = true)
	public void getTitleHome() {

		driver.get("https://www.amaxinsurance.com/");

		String actualTitle = driver.getTitle();

		System.out.println("Page Title is:" + actualTitle);

		String expectedTitle = "A-MAX Auto Insurance | Cheap Car Insurance in Texas";

		String descr = "";

		System.out.println(actualTitle);

		boolean b = true;

		try {

			Assert.assertEquals(actualTitle, expectedTitle);

		} catch (AssertionError e) {

			// TestUtil.sendEmail("GetQuote Failed with PublicData mode 11");
			// assertFalse(condition);
			// e.printStackTrace();
			descr = "Title mismatched...";
			b = false;
		}

		if (b)

			TestUtils.sendEmail(
					"SUCCESS.A-max website UP and Running test got passed.",
					"SUCCESS - A-max website is Up and Running :)"
					);

		else {
			TestUtils.sendEmail("FAILED - A-max website got failed for page title verification, but I'm checking immediately...!",
					"FAILED.A-max website UP and Running test got failed :/"
					);

			throw (new AssertionError(descr));
		}

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
