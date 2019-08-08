package designpatterns.factorymethod;

public class Main {

    public static void main(String[] args) {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }

}
