package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JvmReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue ="org.step" ,plugin= {"json:src\\test\\resources\\instagram\\insta.json"})
public class TestRunner{
	@AfterClass
	public static void afterClass() {
	JvmReport.CucumberReport("src\\test\\resources\\instagram\\insta.json");
	}
	
	
	

}
 