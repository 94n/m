package designpatterns.dependencyinjection;

import java.io.PrintStream;

class Greeter {

    private PrintStream out;

    Greeter(PrintStream out) {
        this.out = out;
    }

    void greet() {
        this.out.println("Hello world!");
    }

}
