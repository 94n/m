package designpatterns.multiton;

import java.util.HashMap;
import java.util.Map;

public class Multiton {

    private static final Map<MultitonType, Multiton> instances = new HashMap<>();

    private MultitonType number;

    private Multiton(MultitonType number) {
        this.number = number;
    }

    // Sample usage
    public static void main(String[] args) {
        Multiton m0 = Multiton.getInstance(MultitonType.ZERO);
        Multiton m1 = Multiton.getInstance(MultitonType.ONE);
        Multiton m2 = Multiton.getInstance(MultitonType.TWO);
        System.out.println(m0);
        System.out.println(m1);
        System.out.println(m2);
    }

    private static Multiton getInstance(MultitonType type) {
        // lazy init (not thread safe as written)
        // Recommend using Double Check Locking if needing thread safety
        if (!instances.containsKey(type)) {
            instances.put(type, new Multiton(type));
        }
        return instances.get(type);
    }

    public String toString() {
        return "My number is " + number;
    }

}
