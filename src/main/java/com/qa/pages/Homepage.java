package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.util.Initialization;

public class Homepage extends Initialization{
	
	By sourceTB = By.xpath("//*[@id='FromSector_show']");
	By selectsource = By.xpath("//*[@id=\\\"ui-id-23\\\"]");
	By destinationTB = By.xpath("//*[@id=\"Editbox13_show\"]");
	By selectdestination = By.xpath("//*[@id='ui-id-33']");
	By date = By.xpath("//input[@id='ddate']");
	By selectdate = By.xpath("(//li[text()='14'])[1]");
	By searchBTN = By.xpath("(//input[@value='Search'])[1]");
	
	
	public void sourceAndDestination(String source, String Destination) {
		driver.findElement(sourceTB).clear();
		driver.findElement(sourceTB).sendKeys(source);
		driver.findElement(selectsource).click();
		
		driver.findElement(destinationTB).clear();
		driver.findElement(destinationTB).sendKeys(Destination);
		driver.findElement(selectdestination).click();
		
		driver.findElement(date).click();
		driver.findElement(selectdate).click(); // 14-08-2020 was considered
		driver.findElement(searchBTN).click();
		
	}

}
