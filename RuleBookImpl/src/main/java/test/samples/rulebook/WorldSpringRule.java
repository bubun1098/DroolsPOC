package test.samples.rulebook;
import com.deliveredtechnologies.rulebook.annotation.*;
import com.deliveredtechnologies.rulebook.spring.RuleBean;
import org.springframework.beans.factory.annotation.Autowired;

@RuleBean
@Rule(order = 2)
public class WorldSpringRule {
@Autowired
HelloWorldComponent helloWorldComponent;

    @Given("company")
    private String company;

    @Result
   private String result;
//
//    @Result
//    private User user;



    @When
    public boolean when() {
        return company != null;
    }

    @Then
    public void then() {


        result = result + company + ",";

    }
}
