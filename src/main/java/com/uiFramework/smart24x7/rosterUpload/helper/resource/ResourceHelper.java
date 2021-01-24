package com.uiFramework.smart24x7.rosterUpload.helper.resource;

public class ResourceHelper {

	public static String getResourcePath(String path) {
		System.out.println(path);
		String basepath = System.getProperty("user.dir");
		System.out.println(basepath + "/" + path);
		return basepath + "/" + path;

	}
}
