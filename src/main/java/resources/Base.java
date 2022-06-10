package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		String file = System.getProperty("user.dir")+"/src/main/java/resources/data.properties";
		
		FileInputStream fis = new FileInputStream(file);
		
		prop = new Properties();
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			String ch = System.getProperty("user.dir")+"/driver/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ch);
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
}
