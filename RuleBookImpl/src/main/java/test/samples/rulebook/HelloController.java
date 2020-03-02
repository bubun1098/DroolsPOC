package test.samples.rulebook;

import com.deliveredtechnologies.rulebook.FactMap;
import com.deliveredtechnologies.rulebook.NameValueReferableMap;
import com.deliveredtechnologies.rulebook.Result;
import com.deliveredtechnologies.rulebook.model.RuleBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @Autowired
    RuleBook<String> rulebook;

    @RequestMapping(value = "/test", produces = "application/json")
    public User index() {
        NameValueReferableMap<String> facts = new FactMap<String>();
        facts.setValue("name", "Raj");
        facts.setValue("company", "IBM");
       facts.setValue("location", "Bangalore");
        rulebook.run(facts);

        if (rulebook.getResult().isPresent()) {
            Result<String> result = rulebook.getResult().get();
            String [] values = result.getValue().split(",");
            return new User(values[0], values[1],values[2]);
        }
        else{
            return new User("NA","NA","NA");
        }

    }
}