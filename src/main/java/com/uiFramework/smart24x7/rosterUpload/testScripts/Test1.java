package com.uiFramework.smart24x7.rosterUpload.testScripts;

import org.testng.annotations.Test;

import com.uiFramework.smart24x7.rosterUpload.helper.assertion.AssertionHelper;
import com.uiFramework.smart24x7.rosterUpload.testbase.TestBase;

public class Test1 extends TestBase{

@Test
public void testLogin(){
AssertionHelper.makeTrue();	
}
@Test
public void testLogin1(){
AssertionHelper.makeFalse();	
}
@Test
public void testLogin2(){
AssertionHelper.makeTrue();	
}
@Test
public void testLogin3(){
AssertionHelper.makeFalse();	
}
}
