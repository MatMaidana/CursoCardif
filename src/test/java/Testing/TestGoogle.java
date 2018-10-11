package Testing;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;


public class TestGoogle {
	private WebDriver driver;
	

		
		@Before
		public void setUp() {
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla\\Firefox\\firefox.exe");
			FirefoxOptions options = new FirefoxOptions ();
			options.setCapability("marionette",false);
			driver = new FirefoxDriver(options);
			driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
		
		}
		
		@Test
		public void TestingTitulo() {
				String Titulo= driver.getTitle();
				
				assertEquals("Google",Titulo);
		}	
		
				
		
		
		@After
		public void tearDown() {
			driver.quit();
		}

		
		

}
