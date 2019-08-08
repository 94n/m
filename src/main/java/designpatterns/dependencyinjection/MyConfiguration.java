package designpatterns.dependencyinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MyConfiguration {

    @Bean
    public Client client(ExampleService service) {
        return new Client(service);
    }

}
