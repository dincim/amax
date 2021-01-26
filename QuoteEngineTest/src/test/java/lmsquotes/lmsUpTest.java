package lmsquotes;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qe.qa.base.TestBase;
import com.quote.qa.pages.lmsUp;

public class lmsUpTest extends TestBase {
	
	lmsUp lmsupandrun;
	
	
	public lmsUpTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();
		lmsupandrun = new lmsUp();
	}
	
	@Test(enabled=false)
	public void lmsLogIn() throws InterruptedException {
		
		driver.get("https://amax.gplex.com/?task=skills");
		
		driver.findElement(By.xpath("//*[@name='user']")).sendKeys("2002");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Amax2002");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='wp-submit']")).click();
		
		
	}
	
	

}
