package designpatterns.dependencyinjection;

import java.util.HashSet;
import java.util.Set;

class ServiceInjector {

    private Set<ServiceSetter> clients = new HashSet<>();

    void inject(ServiceSetter client) {
        clients.add(client);
        client.setService(new ServiceFoo());
    }

    void switchToBar() {
        for (ServiceSetter client : clients) {
            client.setService(new ServiceBar());
        }
    }

    void print() {
        clients.forEach(c -> System.out.println(c.getService()));
    }

}
