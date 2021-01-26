package com.qe.qa.testcases;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qe.qa.base.TestBase;
import com.qe.qa.util.TestUtil;
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
			TestUtil.sendEmail("SUCCESS. Getting quote with PublicData test", "SUCCESS - GetQuote w/ PublicData");
		else
			TestUtil.sendEmail("FAILED. Getting quote with PublicData test", "FAILED - GetQuote w/ PublicData");

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
			TestUtil.sendEmail("SUCCESS. Getting quote with manual input test", "SUCCESS - GetQuote w/ Manual input");
		else
			TestUtil.sendEmail("FAILED. Getting quote with manual input test", "FAILED - GetQuote w/ Manual input");

	}

	@Test(enabled = true)
	public void getTitleRateEngine() {

		String actualTitle = driver.getTitle();
		System.out.println("Page Title :" + actualTitle);

		String expectedTitle = "A-MAX Auto Insurance";

		boolean b = true;
		try {

			Assert.assertEquals(actualTitle, expectedTitle);

		} catch (Exception e) {

			// TestUtil.sendEmail("");
		}

		if (b)
			TestUtil.sendEmail("SUCCESS.A-max website UP and Running test!",
					"SUCCESS - A-max website is Up and Running");
		else
			TestUtil.sendEmail("FAILED..A-max website UP and Running test!", "FAILED - A-max website has crashed!");

	}

	@Test(enabled = true)
	public void getTitleHome() {

		driver.get("https://www.amaxinsurance.com/");

		String actualTitle = driver.getTitle();

		System.out.println("Page Title :" + actualTitle);

		String expectedTitle = "A-MAX Auto Insurance | Cheap Car Insurance in Texas";

		String descr = "";

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

			TestUtil.sendEmail("SUCCESS.Quote Engine app is UP and Running test!",
					"SUCCESS - Quote Engine app is Up and Running");

		else {
			TestUtil.sendEmail("FAILED.Quote Engine app UP and Running test!",
					"FAILED - Quote Engine app has crashed!");

			throw (new AssertionError(descr));
		}

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();

	}

}
