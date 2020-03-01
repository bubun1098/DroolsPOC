package rules;


import model.Case;

public interface IRule {
    void helloUser(final Case aCase, final Response response);
}
