package designpatterns.dependencyinjection;

public class Client implements ServiceSetter {

    private Service service;

    Client(Service service) {
        this.service = service;
    }

    String greet() {
        return "Hi " + service;
    }

    @Override
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public Service getService() {
        return service;
    }



}
