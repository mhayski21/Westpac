package stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.BaseUtil;
import utility.FileReaderConfig;
import commonMethod.CommonMethods;


public class KiwiSaverRetirementCalculator extends BaseUtil {

	
	CommonMethods com = new CommonMethods();
	FileReaderConfig obj = new FileReaderConfig();
	Properties prop = obj.getProperty();
	WebDriverWait wait;
	WebElement element;
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	SoftAssert sa = new SoftAssert();
	ExtentReports extent;
	
	@BeforeTest
	public void startTest() {
		String extendReportFile = System.getProperty("user.dir") + "\\target\\testreport" + "\\extentReportFile.html";
		extent = new ExtentReports();
	}
	
	@Given("The user open a browser, enters to Westpac New Zealand Limited website")
	public void the_user_open_a_browser_enters_to_Westpac_New_Zealand_Limited_website() throws FileNotFoundException, ClassNotFoundException {
		driver.get(prop.getProperty("browser.baseURL"));
		com.waitForLoad(driver);
	}

	@Given("navigates to KiwiSaver > KiwiSaver calculators > Click here to get started button")
	public void navigates_to_KiwiSaver_KiwiSaver_calculators_Click_here_to_get_started_button() throws ClassNotFoundException {
		
		wait = new WebDriverWait(driver, 30);

		driver.findElement(By.xpath(prop.getProperty("mainMenu.kiwiSaver"))).click();
		com.waitUntilElementPresent(prop.getProperty("subMenu.kiwiSaver.calculators"));
		driver.findElement(By.xpath(prop.getProperty("subMenu.kiwiSaver.calculators"))).click();

		com.waitForLoad(driver);

		com.waitUntilElementPresent(prop.getProperty("btn.calculatorGetStarted"));
		driver.findElement(By.xpath(prop.getProperty("btn.calculatorGetStarted"))).click();

		com.waitForLoad(driver);

		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	}
	
	  @When("The user clicks on information icon besides the {string} field")
	  public void the_user_clicks_on_information_icon_besides_the_field(String
	  fieldName) throws ClassNotFoundException {
	  		  
		  driver.switchTo().frame(0);
		  
		  if (fieldName.toLowerCase().equals("current age")) {
		  element = driver.findElement(By.xpath(prop.getProperty("icon.currentAge")));
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("arguments[0].click();", element);
		  
		  } else if (fieldName.toLowerCase().equals("employment status")) {
		  element = driver.findElement(By.xpath(prop.getProperty("icon.employmentStatus")));
		  JavascriptExecutor executor = (JavascriptExecutor) driver;
		  executor.executeScript("arguments[0].click();", element);
		  
		  }
	  
	  }
	  
	  @Then("message {string} is displayed below the {string} field") public void
	  message_is_displayed_below_the_field(String message, String fieldName) throws ClassNotFoundException {
	  		  
		  com.waitForLoad(driver);
		  String actualMessage = driver.findElement(By.xpath(prop.getProperty("txt.Message"))).getText();
	  
	  }
	  
	  @When("The user put on values on fields")
	  public void the_user_put_on_values_on_fields() throws Exception {  
		  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  driver.switchTo().frame(0);

	      File testDataPath = new File(kiwiSaverCalcFile);
	      
			try {				
				
				FileInputStream ip = new FileInputStream(testDataPath);
				XSSFWorkbook wb = new XSSFWorkbook(ip);
				XSSFSheet sheet = wb.getSheet("Sheet1");
				int startRow = sheet.getFirstRowNum();
				int endRow = sheet.getLastRowNum();
				
				for (int i = startRow + 1; i <= endRow; i++) {
					
					com.waitForLoad(driver);
					
					String currentAge = null;
					String employmentStatus = null;
					String salaryBeforeTax = null;
					String kiwiSaverMemContri = null;
					String pIRRate = null;
					String currentKiwiSaverBalance = null;
					String voluntaryContributions = null;
					String frequency = null;
					String RiskProfile = null;
					String savingsGoalAtRetirement = null;
					String expectedAmt = null;
					
					XSSFRow row = sheet.getRow(i);
					currentAge = sheet.getRow(i).getCell(0).getStringCellValue();
					
					try {
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					try {
						employmentStatus = sheet.getRow(i).getCell(1).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {

					    salaryBeforeTax = sheet.getRow(i).getCell(2).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {
					    
					    kiwiSaverMemContri = sheet.getRow(i).getCell(3).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {

					    pIRRate = sheet.getRow(i).getCell(4).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {
					    
					    currentKiwiSaverBalance = sheet.getRow(i).getCell(5).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {

					    voluntaryContributions = sheet.getRow(i).getCell(6).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {
						
					    frequency = sheet.getRow(i).getCell(7).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {

					    RiskProfile = sheet.getRow(i).getCell(8).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					try {

						savingsGoalAtRetirement = sheet.getRow(i).getCell(9).getStringCellValue();
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					expectedAmt = sheet.getRow(i).getCell(10).getStringCellValue();
				    
				    com.waitUntilElementPresent(prop.getProperty("txt.currentAge"));
				    
				    if(!(currentAge == "") && !(currentAge == null)) {
						 element = driver.findElement(By.xpath(prop.getProperty("txt.currentAge")));
						 executor.executeScript("arguments[0].click();", element);
						 element.sendKeys(currentAge);
				    }
				    
				    if(!(employmentStatus == "") && !(employmentStatus == null)) {
				    	com.waitUntilElementPresent(prop.getProperty("list.employmentStatus"));
						 element = driver.findElement(By.xpath(prop.getProperty("list.employmentStatus")));
						 executor.executeScript("arguments[0].click();", element);
						 com.waitUntilElementPresent(prop.getProperty("employmentStatus.employed"));
						 
						 if(employmentStatus.toLowerCase().equals("employed")) {
							 element = driver.findElement(By.xpath(prop.getProperty("employmentStatus.employed")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(employmentStatus.toLowerCase().equals("self-employed")) {
							 element = driver.findElement(By.xpath(prop.getProperty("employmentStatus.selfemployed")));
							 executor.executeScript("arguments[0].click();", element);
						 }else {
							 element = driver.findElement(By.xpath(prop.getProperty("employmentStatus.notEmployed")));
							 executor.executeScript("arguments[0].click();", element);
						 }
						 Thread.sleep(5000);
				    }				    
				    
				    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				    
				    if(!(salaryBeforeTax == "") && !(salaryBeforeTax == null)) {
				    	com.waitUntilElementPresent(prop.getProperty("txt.salary"));
				    	element = driver.findElement(By.xpath(prop.getProperty("txt.salary")));
						 executor.executeScript("arguments[0].click();", element);
						 element.sendKeys(salaryBeforeTax);
				    }
				    
				    if(!(kiwiSaverMemContri == "") && !(kiwiSaverMemContri == null)) {
				    	com.waitUntilElementPresent(prop.getProperty("rbtn.three"));
				    	if(kiwiSaverMemContri.equals("3%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("rbtn.three")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(kiwiSaverMemContri.equals("4%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("rbtn.four")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(kiwiSaverMemContri.equals("6%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("rbtn.six")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(kiwiSaverMemContri.equals("8%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("rbtn.eight")));
							 executor.executeScript("arguments[0].click();", element);
						 } else{
							 element = driver.findElement(By.xpath(prop.getProperty("rbtn.ten")));
							 executor.executeScript("arguments[0].click();", element);
						 }
				    	
				    }
				    
				    if(!(pIRRate == "") && !(pIRRate == null)) {
				    	com.waitUntilElementPresent(prop.getProperty("list.pirRate"));
				    	element = driver.findElement(By.xpath(prop.getProperty("list.pirRate")));
						 executor.executeScript("arguments[0].click();", element);
						 com.waitUntilElementPresent(prop.getProperty("pirRate.tenandhalf"));
						 if(pIRRate.equals("10.5%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("pirRate.tenandhalf")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(pIRRate.equals("17.5%")) {
							 element = driver.findElement(By.xpath(prop.getProperty("pirRate.seventeen")));
							 executor.executeScript("arguments[0].click();", element);
						 }else {
							 element = driver.findElement(By.xpath(prop.getProperty("pirRate.twentyeight")));
							 executor.executeScript("arguments[0].click();", element);
						 }
				    }
				   
				    if(!(currentKiwiSaverBalance == "") && !(currentKiwiSaverBalance == null)) {
				    	element = driver.findElement(By.xpath(prop.getProperty("txt.kiwiSaverBalance")));
						 executor.executeScript("arguments[0].click();", element);
						 element.sendKeys(currentKiwiSaverBalance);
				    }
				    
				    if(!(voluntaryContributions == "") && !(voluntaryContributions == null)) {
				    	element = driver.findElement(By.xpath(prop.getProperty("txt.voluntaryContributions")));
						 executor.executeScript("arguments[0].click();", element);
						 element.sendKeys(voluntaryContributions);
				    	
				    }
				    
				    if(!(frequency == "") && !(frequency == null)) {
				    	com.waitUntilElementPresent(prop.getProperty("list.frequency"));
				    	element = driver.findElement(By.xpath(prop.getProperty("list.frequency")));
						 executor.executeScript("arguments[0].click();", element);
						 
						 com.waitUntilElementPresent(prop.getProperty("frequency.Annually"));
						 if(frequency.toLowerCase().equals("one-off")) {
							 element = driver.findElement(By.xpath(prop.getProperty("frequency.Oneoff")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(frequency.toLowerCase().equals("weekly")) {
							 element = driver.findElement(By.xpath(prop.getProperty("frequency.Weekly")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(frequency.toLowerCase().equals("fortnightly")) {
							 element = driver.findElement(By.xpath(prop.getProperty("frequency.Fortnightly")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(frequency.toLowerCase().equals("monthly")) {
							 element = driver.findElement(By.xpath(prop.getProperty("frequency.Monthly")));
							 executor.executeScript("arguments[0].click();", element);
						 }else {
							 element = driver.findElement(By.xpath(prop.getProperty("frequency.Annually")));
							 executor.executeScript("arguments[0].click();", element);
						 }				    	
				    }
				    
				    if(!(RiskProfile == "") && !(RiskProfile == null)) {
						 if(RiskProfile.toLowerCase().equals("low")) {
							 element = driver.findElement(By.xpath(prop.getProperty("radiobtn.riskProfile.low")));
							 executor.executeScript("arguments[0].click();", element);
						 }else if(RiskProfile.toLowerCase().equals("medium")) {
							 element = driver.findElement(By.xpath(prop.getProperty("radiobtn.riskProfile.medium")));
							 executor.executeScript("arguments[0].click();", element);
						 }else {
							 element = driver.findElement(By.xpath(prop.getProperty("radiobtn.riskProfile.high")));
							 executor.executeScript("arguments[0].click();", element);
						 }
				    	
				    }
				    
				    if(!(savingsGoalAtRetirement == "") && !(savingsGoalAtRetirement == null)) {
				    	element = driver.findElement(By.xpath(prop.getProperty("txt.savingsGoal")));
						 executor.executeScript("arguments[0].click();", element);
						 element.sendKeys(savingsGoalAtRetirement);
				    }
				    
				    com.waitUntilElementPresent(prop.getProperty("btn.calculate"));
				    
				    element = driver.findElement(By.xpath(prop.getProperty("btn.calculate")));
					 executor.executeScript("arguments[0].click();", element);
					 
					 driver.findElement(By.xpath("//span[text()='"+expectedAmt+"']")).isDisplayed();
					 
					 sa.assertTrue(driver.findElement(By.xpath("//span[text()='"+expectedAmt+"']")).isDisplayed());
					 
					 com.waitUntilElementPresent(prop.getProperty("verify.calculate"));
					 
					 driver.navigate().refresh();
				    
				}
			}catch (Exception e) {
				throw e;
			}

	  }

	  @Then("it will calculate their KiwiSaver projected balance at retirement")
	  public void it_will_calculate_their_KiwiSaver_projected_balance_at_retirement() {
	  }
	  
	  
	 

}
