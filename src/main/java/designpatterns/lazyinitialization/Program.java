package designpatterns.lazyinitialization;

public class Program {

    public static void main(String[] args) {
        Fruit.getFruitByTypeName(FruitType.banana);
        Fruit.showAll();
        Fruit.getFruitByTypeName(FruitType.apple);
        Fruit.showAll();
        Fruit.getFruitByTypeName(FruitType.banana);
        Fruit.showAll();
    }

}
