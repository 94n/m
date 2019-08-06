package designpatterns.dependencyinjection;

public class Injector {
    public static void main(String[] args) {
        // Build the dependencies first
        Service service = new ExampleService();

        // Inject the service, constructor style
        Client client = new Client(service);

        // Use the objects
        System.out.println(client.greet());
    }
}
