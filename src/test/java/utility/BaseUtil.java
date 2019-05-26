package utility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class BaseUtil {
	
	public String stepInfo;
	public static WebDriver driver = null;
	public ExtentReports extent;
	public static String reportLocation = "target/report/extentreport/";
	public static ExtentTest scenarioDef;
	public static ExtentTest features;
	public static String kiwiSaverCalcFile = "KiwiSaverCalculator.xlsx";

}
