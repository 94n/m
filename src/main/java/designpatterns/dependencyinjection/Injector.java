package designpatterns.dependencyinjection;

public class Injector {

    public static void main(String[] args) {
        // Construction code.
        Greeter greeter = new Greeter(System.out); // This may be many lines that connect many objects

        // Behavior code.
        greeter.greet(); // This is one call to one method on one object in the object graph
    }

}
