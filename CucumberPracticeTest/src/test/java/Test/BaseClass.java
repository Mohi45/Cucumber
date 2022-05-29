package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Properties prop;

	public BaseClass() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
							+ "resources" + File.separator + "Credentials.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void initialiseBrowser() {
		System.out.println("Hello BaseAutomation");
		ChromeOptions option = new ChromeOptions();
		// option.addArguments("headless");

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);

		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.quit();

	}

	public void browserOpen() throws InterruptedException {

		String url = System.getProperty("URL");
		if (url == null)
			url = prop.getProperty("URL");
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	public void takeScreenshot(Scenario scenario) {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", null);
	}

	// mvn clean test -DURL="https://abcd.com/"
}
