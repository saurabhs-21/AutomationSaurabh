package com.uiFramework;

import org.testng.Assert;

public class B {
	int i = 1;

	@org.testng.annotations.Test
	public void testLoginB() {
		if (i == 3) {
			Assert.assertTrue(true);
		} else {
			System.out.println(i);
			i++;
			Assert.assertTrue(false);
		}
	}
}
