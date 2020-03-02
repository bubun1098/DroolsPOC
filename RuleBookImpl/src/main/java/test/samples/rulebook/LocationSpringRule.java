package test.samples.rulebook;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.spring.RuleBean;
import org.springframework.beans.factory.annotation.Autowired;
import test.samples.rulebook.HelloSpringRule;
import test.samples.rulebook.WorldSpringRule;

@RuleBean
@Rule(order = 3)

public class LocationSpringRule {
    @Autowired
    HelloWorldComponent helloWorldComponent;
    @Given("location")
    private String location;

    @Result
    private String result;


    private User user;
    @Result
    private String userDetails;
    @When
    public boolean when() {
        return location != null;
    }

    @Then
    public void then() {
       result = helloWorldComponent.getHelloWorld(result + location);
    }
}
