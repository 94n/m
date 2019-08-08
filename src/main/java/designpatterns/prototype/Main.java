package designpatterns.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype1();
        Prototype prototype1 = prototype.clone();
        System.out.println(prototype);
        System.out.println(prototype1);
    }

}
