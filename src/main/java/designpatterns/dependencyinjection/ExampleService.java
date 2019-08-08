package designpatterns.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
class ExampleService implements Service {

    public String toString() {
        return getName();
    }

    private String getName() {
        return "World!";
    }

}
