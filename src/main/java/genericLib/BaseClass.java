package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver driver;
	public PropertyFile pdata = new PropertyFile();
	public WebDriverUtilities driverutilities = new WebDriverUtilities();
	@BeforeMethod
	public void openApp() throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int status = res.getStatus();
		String name = res.getName();
		if(status==2) {
			Screenshot s = new Screenshot();
			s.getscreenshot(driver, name);
		}
		driver.quit();
	}
}
