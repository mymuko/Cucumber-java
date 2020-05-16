
package com.mycompany;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
"src/test/resources/com/mycompany/LoginFacebook.feature"},

        glue = {"com.mycompany.infrastructure",
                "com.mycompany.loginpage"})
public class RunTest {
    
}
