package step_definitions;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Hooks extends Base{
	
	@Before
	public void setup() throws MalformedURLException {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		chromeOptions.setHeadless(false);
//		driver = new ChromeDriver(chromeOptions);
//		chromeOptions.addArguments("--disable-notifications");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 ChromeOptions opt = new ChromeOptions();
			
		 driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
		
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			String screenshotName= scenario.getName().replace("", "");
			if(scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot)driver;
				byte[]screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		driver.quit();
	}
}
