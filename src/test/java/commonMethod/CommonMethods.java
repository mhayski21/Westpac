package commonMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utility.BaseUtil;

public class CommonMethods extends BaseUtil{

	public void waitForLoad(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;

		if (js.executeScript("return document.readyState").toString().equals("complete")){
			System.out.println("Page Is loaded.");
			return;
		}

		for (int i=0; i<25; i++){
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
			//To check page ready state.
			if (js.executeScript("return document.readyState").toString().equals("complete")){
				break;
			}
		}
	}
	
	public void hoverToXpathElement(WebDriver driver, String xpath) {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(xpath));
		actions.moveToElement(mainMenu);
	}
	
	public void isElementPresent(WebDriver driver, String xpath) {
		Actions actions = new Actions(driver);
		WebElement mainMenu = driver.findElement(By.xpath(xpath));
		actions.moveToElement(mainMenu);
	}
	
	public void switchToFrame(WebDriver driver, WebElement frameElement) {
		try {
			driver.switchTo().frame("id='widget'");
			System.out.println("Navigated to frame with element "+ frameElement);
		} catch (NoSuchFrameException e) {
			System.out.println("Unable to locate frame with element " + frameElement + e.getStackTrace());
		} catch (StaleElementReferenceException e) {
			System.out.println("Element with " + frameElement + "is not attached to the page document" + e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to navigate to frame with element " + frameElement + e.getStackTrace());
		}
	}
	
	public void waitUntilElementPresent (String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement wb = driver.findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	

}
