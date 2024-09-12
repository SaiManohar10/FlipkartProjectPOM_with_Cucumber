package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = {"C:\\Program Files\\sts-4.21.1.RELEASE\\Flipkart_POM_BDD_Cucumber_Project\\src\\test\\resources\\Flipkart\\flipkart.feature"},
	glue = ("com.stepDefinition")  //inside bracket Packege Name
 )
public class bddCucumberRunner extends AbstractTestNGCucumberTests{

}
