package com.Automation.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.Automation.Generic.DriverUtils;

public class BaseTest {
@BeforeTest
public void setUp() {
	DriverUtils.createDriver();
	System.out.println("driver created");
}
}
