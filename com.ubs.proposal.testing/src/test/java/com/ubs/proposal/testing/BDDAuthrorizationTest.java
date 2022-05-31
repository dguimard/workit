package com.ubs.proposal.testing;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.ConfigurationParameters;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectClasspathResources;
import org.junit.platform.suite.api.Suite;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.EventPublisher;
import lombok.extern.slf4j.Slf4j;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResources({
    @SelectClasspathResource("com/ubs/features/basic.feature"),
})
@ConfigurationParameters({
    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber/cucumber.html, com.ubs.application.RunCukesDirectThroughputTests$CukeNaiveLifeCycleHandler"),
})
@Slf4j
public class BDDAuthrorizationTest {
	 public static class CukeNaiveLifeCycleHandler implements EventListener {

	        @Override
	        public void setEventPublisher(EventPublisher eventPublisher) {
	          
	        }
	    }
}
