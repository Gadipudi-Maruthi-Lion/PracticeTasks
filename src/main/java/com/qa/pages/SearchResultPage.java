package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.util.Initialization;

import edu.emory.mathcs.backport.java.util.Collections;

public class SearchResultPage extends Initialization{
	
	
	By prices = By.xpath("//*[contains(@id,\"spnPrice\")]");
	
	
	public void getAllFares() {
		int size = driver.findElements(prices).size();
		for(int n=0;n<=size;n++) {
			System.out.println("prices of Flight is "+n);
		}
	}
	public void getLowestPrice() {
		List<WebElement> li = driver.findElements(prices);
		Collections.sort(li);
		String leastprice = li.get(0).getText();
		System.out.println(leastprice);
	}
	
	

}
