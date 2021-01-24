package com.uiFramework.smart24x7.rosterUpload.helper.select;

import java.util.LinkedList;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.uiFramework.smart24x7.rosterUpload.helper.logger.LoggerHelper;

public class DropDownHelper {
	private WebDriver driver;
	private Logger log = LoggerHelper.getLogger(DropDownHelper.class);

	public DropDownHelper(WebDriver driver) {
		this.driver = driver;
		log.info("DropDownHelper object  created ...");
	}

	public void selectUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		log.info("selectUsingValue and value is: " + value);
		select.selectByValue(value);
	}

	public void selectUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		log.info("selectUsingIndex and index is: " + index);
		select.selectByIndex(index);
	}

	public void selectUsingVisibleText(WebElement element, String VisibleText) {
		Select select = new Select(element);
		log.info("selectUsingVisibleText and VisibleText is: " + VisibleText);
		select.selectByVisibleText(VisibleText);
	}

	public void deselectUsingValue(WebElement element, String value) {
		Select select = new Select(element);
		log.info("deselectUsingValue and value is: " + value);
		select.deselectByValue(value);
	}

	public void deselectUsingIndex(WebElement element, int index) {
		Select select = new Select(element);
		log.info("deselectUsingIndex and index is: " + index);
		select.deselectByIndex(index);
	}

	public void deselectUsingVisibleText(WebElement element, String VisibleText) {
		Select select = new Select(element);
		log.info("deselectUsingVisibleText and VisibleText is: " + VisibleText);
		select.deselectByVisibleText(VisibleText);
	}

	public LinkedList<String> getAllDropDownData(WebElement element) {
		Select select = new Select(element);
		java.util.List<WebElement> elementList = select.getOptions();
		LinkedList<String> valueList = new LinkedList<String>();
		for (WebElement ele : elementList) {
			log.info(element.getText());
			valueList.add(ele.getText());
		}
		return valueList;
	}
}
