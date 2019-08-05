package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@SpringBootApplication
@ComponentScan
@Configuration
public class HelloApp {

    public static void main(String[] args) {
        SpringApplication.run(HelloApp.class, args);
    }

    @Bean
    public HelloService helloService() {
        return new ConsoleHelloService("Hi", "!");
    }

}
