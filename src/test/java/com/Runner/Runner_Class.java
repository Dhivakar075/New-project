package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\main\\java\\com\\Feature\\lime_road.feature",
					glue = "com.step",
					plugin = {"pretty","json:Resources/lime.json","html:Res/limeroad.html"})


public class Runner_Class extends Base_Class{
	
@BeforeClass
public static void browserLaunch() {
browserLaunch("chrome");
	
}
@AfterClass
public static void tearDown() {
	quit();
}
}