package rules;

import model.Case;
import model.User;
import org.openl.rules.runtime.RulesEngineFactory;
import org.openl.runtime.EngineFactory;

public class Main {
    private IRule instance;

    public static void main(String[] args) {
        Main rules = new Main();
        User user = new User();
        user.setName("Raj Banerjee");
        Case aCase = new Case();
        aCase.setUser(user);
        aCase.setHourOfDay(15);
        rules.process(aCase);
    }

    public void process(Case aCase) {
        final EngineFactory<IRule> engineFactory = new RulesEngineFactory<IRule>(getClass().getClassLoader()
                .getResource("openltablets/HelloUser.xls"), IRule.class);
        instance = engineFactory.newEngineInstance();
        instance.helloUser(aCase, new Response());
    }
}
