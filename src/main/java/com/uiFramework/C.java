package com.uiFramework;

import org.testng.Assert;

public class C {
	int i = 1;

	@org.testng.annotations.Test
	public void testLoginC() {
		
			System.out.println(i);
			i++;
			Assert.assertTrue(false);
		}
	}

