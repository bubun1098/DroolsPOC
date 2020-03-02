package test.samples.rulebook;

import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.spring.RuleBean;

@RuleBean
@Rule(order = 1)
public class HelloSpringRule {
    @Given("name")
    private String name;

@Result
    private String result;



    @When
    public boolean when() {
        return name != null;
    }

    @Then
    public void then() {
        result = name+ ",";

    }
}