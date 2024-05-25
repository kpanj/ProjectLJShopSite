package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	public void dropDown(WebElement ele,String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele);
	}
	
	public void rightClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public void draganddrop(WebDriver driver,WebElement source,WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void alertPop(WebDriver driver) {
		driver.switchTo().alert();
	}
	
	public void switchToFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void switchBackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void switchTab(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);
		}
	}
	
	public void scrollBar(WebDriver driver, int x , int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
