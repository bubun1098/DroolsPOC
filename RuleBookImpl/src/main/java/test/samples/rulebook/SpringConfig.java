package test.samples.rulebook;

import com.deliveredtechnologies.rulebook.model.RuleBook;
import com.deliveredtechnologies.rulebook.model.runner.RuleBookRunner;
import com.deliveredtechnologies.rulebook.spring.SpringAwareRuleBookRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "test.samples.rulebook")
@Configuration
public class SpringConfig {
    @Bean
    public RuleBook ruleBook() {
        RuleBook ruleBook = new SpringAwareRuleBookRunner("test.samples.rulebook");
        return ruleBook;
    }
}