package designpatterns.abstractfactory;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String randomAppearance = Arrays.asList("osx", "win").get(new Random().nextInt(2));
        GuiFactory factory = AbstractFactory.factory(randomAppearance);
        Button button = factory.createButton();
        button.paint();
    }

}
