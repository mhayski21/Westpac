package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class FileReaderConfig {
	
	Properties prop = new Properties();
	
	public Properties getProperty(){
		//FileInputStream inputStream = null;
		try {
			prop.load(new FileInputStream("src\\test\\resources\\config\\browser-config.properties"));
		} catch (Exception e) {
			System.out.println("Properties Exception: " + e);
		}
		
		return prop;
	}
	

	public String getReportConfigPath(){
		String reportConfigPath = prop.getProperty("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
	}
	
	

}
