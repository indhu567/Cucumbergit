
package org.fbtestrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\fb.feature", glue="org.stepdef", monochrome=true, dryRun=false,tags="@E2E",
plugin={"pretty", "html:C:\\Users\\leovo\\eclipse-workspace\\cucumber.org\\target",
		"json:C:\\Users\\leovo\\eclipse-workspace\\cucumber.org\\target\\sample.json",
		"junit:C:\\Users\\leovo\\eclipse-workspace\\cucumber.org\\target\\sample.xml"},snippets=SnippetType.CAMELCASE) 
		
     
		
public class Fbtestrunner {

}
