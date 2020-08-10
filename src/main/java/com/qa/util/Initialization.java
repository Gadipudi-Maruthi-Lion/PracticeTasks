package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Initialization {

	public WebDriver driver;
	public Properties prop;


	public void setup() throws IOException {
		prop = new Properties();
		FileInputStream fip = new FileInputStream(new File("D:\\Maruthi Work\\Working\\PracticeTasks\\src\\main\\java\\com\\qa\\config\\config.properties"));
		prop.load(fip);
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
		}else
			System.out.println("Please select Type of browser ");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://www.easemytrip.com";
		driver.get(url);

	}

	public void closeBrowser() {
		driver.quit();
	}

}
