package test.samples.rulebook;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {
    public String getHelloWorld(String resultString) {
        System.out.println(resultString);
        return resultString;
    }
}
