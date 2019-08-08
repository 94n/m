package spring;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloAutoConfigurationTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner().withConfiguration(AutoConfigurations.of(HelloAutoConfiguration.class));

    @Rule
    public OutputCapture output = new OutputCapture();

    @Test
    public void defaultServiceBacksOff() {

    }

    @Test
    public void defaultServiceIsAutoConfigured() {
        this.contextRunner.run(context -> {
            assertThat(context).hasSingleBean(HelloService.class);
            context.getBean(HelloService.class).sayHello("World");
            assertThat(this.output.toString()).contains("Hello World!");
        });
    }

    @Configuration
    static class UserConfiguration {

        @Bean
        public HelloService myHelloService() {
            return new ConsoleHelloService("Mine", "**");
        }

    }

}
