package com.selenium.practice.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class practiceSelenium {
	
	@Test
	public void testfunc() throws IOException,FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//senthilkumar.k//Documents//Automation//software//Softwareselenium//chromedriver_win32//chromedriver.exe");
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--window-name");
		options.addArguments("--window-size");
		options.addArguments("--window-position");
		options.addArguments("--version");
		options.addArguments("--incognito");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-extensions");
		options.addArguments("--test-type");
		//options.addArguments("--headless");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		options.setAcceptInsecureCerts(true);
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.merge(capabilities);
		
		File file = new File("C:\\Users\\senthilkumar.k\\Desktop\\10624_new_requirements.xlsx");
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Test");
		XSSFRow row = sheet.getRow(3);
		XSSFCell cell = row.getCell(3);
		
		String getstring = cell.getStringCellValue();
		System.out.println("The excel sheet value is : " +getstring);
		
			
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.emedevents.com");
		driver.close();
		
		
	}

}
