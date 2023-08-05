package com.simplilearn.cucumberdemo.stepdefinition;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import org.junit.jupiter.api.Test;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("resources")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value="pretty")
public class TestRunner {

	@Test
	public void testDemo() {
		System.out.println("This is a test");
	}
}
