package com.uiFramework.smart24x7.rosterUpload.helper.browserConfiguration.config;

import com.uiFramework.smart24x7.rosterUpload.helper.browserConfiguration.BrowserType;

public interface ConfigReader {

	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
}
