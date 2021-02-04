package com.quote.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qe.qa.base.TestBase;
import com.qe.qa.util.TestUtils;

public class GetQuote extends TestBase {

	// Page Factory-- OR
	
	
	@FindBy(xpath = "//input[@name='licenseId']")
	WebElement DriverLicenseNum;

//	@FindBy(xpath = "//input[@name='name']")
//	WebElement driverName;

	@FindBy(xpath = "//input[@id='custom-checkbox-beforeStartStepDiscossion']") ////input[@id='custom-checkbox-beforeStartStepDiscossion']
	WebElement checkDisclosure;

	@FindBy(xpath = "//button[@class='c-btn-red custom-hover filled block']")
	WebElement nxtBtnst;

	@FindBy(xpath = "//button[@class='c-btn-red  custom-hover filled block']")
	WebElement nxtBtnnd;

	@FindBy(xpath = "//label[@for='id-maritalStatus-0']")
	WebElement statusMSingle;

	@FindBy(xpath = "//label[@for='id-gender-0']")
	WebElement statusGMale;

	@FindBy(xpath = "//label[@for='id-isInsured-0']")
	WebElement statusInsuredYes;

	@FindBy(xpath = "//button[@class='c-btn-red  custom-hover filled block']")
	WebElement nxtBtnrd;

	@FindBy(xpath = "//button[@class='c-btn-red h-100 custom-hover filled block']")
	WebElement nxtBtnNo;

	@FindBy(xpath = "//button[@class='list-group-item list-group-item-action carItemButton'][2]")
	WebElement selectCar;

	@FindBy(xpath = "//button[@class='c-btn-red  custom-hover filled block']")
	WebElement nxtBtnCar;

	@FindBy(xpath = "//button[@class='c-btn-red custom-hover m-b-20 multiLine filled block']")
	WebElement nxtGetQuote;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//button[@class='c-btn-red m-t-15 m-b-20 custom-hover  filled block']")
	WebElement contBtn;

	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	WebElement okBtn;

	@FindBy(xpath = "//input[@name = 'name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name = 'surname']")
	WebElement lastName;

	@FindBy(xpath = "//input[@class='form-control amax-calendar ']")
	WebElement dOb;

	@FindBy(xpath = "//input[@name='detail']")
	WebElement streetAdd;

	@FindBy(xpath = "//input[@name='city']")
	WebElement cityName;

	@FindBy(xpath = "//input[@name='state']")
	WebElement stateName;

	@FindBy(xpath = "//input[@name='zip']")
	WebElement zipCode;

	@FindBy(xpath = "//button[@class='circle-button']")
	WebElement calenderBtn;

	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	WebElement month;

	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	WebElement year;

	@FindBy(xpath = "//div[@class='react-datepicker__day react-datepicker__day--008']")
	WebElement day;

	@FindBy(xpath = "//button[@type='button'][7]")
	WebElement carYear;

	@FindBy(xpath = "//*[@type='button'][7]")
	WebElement carMake;

	@FindBy(xpath = "//*[@type='button'][5]")
	WebElement carModel;

	public GetQuote() {
		PageFactory.initElements(driver, this);
	}

	WebDriverWait wait = new WebDriverWait(driver, 5);

	public boolean GetQuoteDl() {

		boolean testResult=true;
		
		try {
			
		
			DriverLicenseNum.sendKeys("1");
	
			//TestUtil.sendEmail("Test basladi");
	
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", checkDisclosure);
			pauseFiveSecond();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
				//TestUtil.sendEmail("GetQuote Failed with PublicData mode 1");
			}
		
	
		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnst)).click();

		pauseFiveSecond();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
return false;
			//TestUtil.sendEmail("GetQuote Failed with PublicData mode 2");
		}

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnnd)).click();

		statusMSingle.click();
		pauseFiveSecond();
		statusGMale.click();
		pauseFiveSecond();
		statusInsuredYes.click();
		pauseFiveSecond();

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnrd)).click();

		pauseFiveSecond();

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnNo)).click();
		// nxtBtnNo.click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			//TestUtil.sendEmail("GetQuote Failed with PublicData mode 3");
		}

		selectCar.click();

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnCar)).click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			//TestUtil.sendEmail("GetQuote Failed with PublicData mode 4");
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		wait.until(ExpectedConditions.elementToBeClickable(nxtGetQuote)).click();
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			//TestUtil.sendEmail("GetQuote Failed with PublicData mode 5");
		}

		String MainWindow = driver.getWindowHandle();

		for (String activeHandle : driver.getWindowHandles()) {
			if (!activeHandle.equals(MainWindow)) {
				driver.switchTo().window(activeHandle);
			}
			phoneNum.sendKeys("11111111111");
			email.sendKeys("tidyseyhan@gmail.com");
			pauseOneSecond();
			contBtn.click();
		}

		pauseFiveSecond();

		//TestUtil.sendEmail("GetQuote Failed with PublicData mode button click oncesi");
		
		okBtn.click();

		//TestUtil.sendEmail("GetQuote Failed with PublicData mode sonrasi");
		}catch(Exception e) {
			return false;
			}
		return testResult;
		
	}

	public boolean getQuoteManual() {
		
		boolean testResult=true;

		// DriverLicenseNum.sendKeys("1");

		firstName.sendKeys("Test");
		lastName.sendKeys("Quote");
		pauseFiveSecond();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// dOb.sendKeys("091178");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", calenderBtn);

//		Actions action = new Actions(driver);
//		action.moveToElement(calenderBtn).click();

		pauseFiveSecond();

		Select monthselect = new Select(month);

		pauseFiveSecond();

		monthselect.selectByVisibleText("May");

		Select yearselect = new Select(year);

		pauseFiveSecond();

		yearselect.selectByVisibleText("1978");

		pauseFiveSecond();

		day.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JavascriptExecutor exe = (JavascriptExecutor) driver;
		exe.executeScript("arguments[0].click();", checkDisclosure);

		pauseFiveSecond();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnst)).click();

		streetAdd.sendKeys("3030 Stemmons Fwy");
		zipCode.sendKeys("75247");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pauseFiveSecond();

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnnd)).click();

		statusMSingle.click();
		pauseFiveSecond();
		statusGMale.click();
		pauseFiveSecond();
		statusInsuredYes.click();

		pauseFiveSecond();

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnrd)).click();

		pauseFiveSecond();

		// wait.until(ExpectedConditions.elementToBeClickable(nxtBtnNo)).click();
		// nxtBtnNo.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// selectCar.click();

		JavascriptExecutor ex = (JavascriptExecutor) driver;
		ex.executeScript("arguments[0].click();", carYear);

//		carYear.click();
		pauseFiveSecond();

		JavascriptExecutor exece = (JavascriptExecutor) driver;
		exece.executeScript("arguments[0].click();", carMake);

		// carMake.click();
		pauseFiveSecond();

		JavascriptExecutor execet = (JavascriptExecutor) driver;
		execet.executeScript("arguments[0].click();", carModel);

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		wait.until(ExpectedConditions.elementToBeClickable(nxtBtnCar)).click();

//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", nxtGetQuote);

		wait.until(ExpectedConditions.elementToBeClickable(nxtGetQuote)).click();

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String MainWindow = driver.getWindowHandle();

		for (String activeHandle : driver.getWindowHandles()) {
			if (!activeHandle.equals(MainWindow)) {
				driver.switchTo().window(activeHandle);
			}
			
			pauseFiveSecond();
			
			phoneNum.sendKeys("11111111111");
			email.sendKeys("tidyseyhan@gmail.com");
			pauseOneSecond();
			contBtn.click();
		}

		pauseFiveSecond();

		okBtn.click();
		
		return testResult;

	}

	private void pauseFiveSecond() {
		// TODO Auto-generated method stub

	}

	private void pauseOneSecond() {
		// TODO Auto-generated method stub

	}

}
