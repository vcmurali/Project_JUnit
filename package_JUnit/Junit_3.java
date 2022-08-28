package package_JUnit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Junit_3 {
	
	// making webDriver a global variable
	WebDriver driver;	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class");
	}
	
	
	@Before
		public void init() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/101/");
		Thread.sleep(3000);
	}
	
	@Test
//Validate that all list item could be removed using the remove button and when "Toggle All" functionality is on.
	public void validationTest1() throws InterruptedException {
		
		driver.findElement(By.name("allbox")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Remove']")).click();
		System.out.println("Toggle all selected and removed all itesm");
	}

//--------------------------------------------------------------------------//		
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}
}
