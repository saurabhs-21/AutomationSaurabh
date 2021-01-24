package com.uiFramework.smart24x7.rosterUpload.helper.browserConfiguration.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.uiFramework.smart24x7.rosterUpload.helper.browserConfiguration.BrowserType;
import com.uiFramework.smart24x7.rosterUpload.helper.resource.ResourceHelper;

public class PropertyReader implements ConfigReader{
	
	private static FileInputStream file;
	public static Properties OR;
	
	static{
		String filePath = ResourceHelper.getResourcePath("src/main/resources/configfile/config.properties");
		try {
			 file = new FileInputStream(new File(filePath));
			 OR = new Properties();
			try {
				OR.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int getImpliciteWait() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getExplicitWait() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPageLoadTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	public BrowserType getBrowserType() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
