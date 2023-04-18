package io.cucumber.jakarta.openejb;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/cucumber/jakarta/openejb")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.cucumber.jakarta.openejb")
public class RunCucumberTest {

}
