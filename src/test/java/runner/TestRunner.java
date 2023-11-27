package runner;


import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
    @CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src/test/java/stepDefinitions", "src/test/java/Hooks"},
            //tags = {"~@Ignore"},
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"}

    )

            public class TestRunner{


}

