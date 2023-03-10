package org.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class JvmReport {
	public static void CucumberReport(String json) {
		File f = new File("C:\\Users\\Mugundhan\\eclipse-workspace\\Cucumber1\\target");
		Configuration c = new Configuration(f, "Cucu demo project");
		c.addClassifications("OS name","windows");
		c.addClassifications("os model","10");
		c.addClassifications("browser name", "Googlechrome");
		c.addClassifications("browser version","108");
		c.addClassifications("sprint number","2");
		List <String> l = new ArrayList<>();
		l.add(json);
		ReportBuilder r =new ReportBuilder(l,c);
		r.generateReports();
	}
}
		