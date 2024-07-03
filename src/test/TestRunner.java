package cucumberdemo.src.test;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.ConfigurationParameter;
import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("login.feature")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class TestRunner {
    // No need for a test method
}
