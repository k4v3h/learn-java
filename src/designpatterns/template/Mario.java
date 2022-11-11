package designpatterns.template;

public class Mario extends Game {
    @Override
    public void initialize() {
        System.out.println("Mario game initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Mario game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Mario game finished!");
    }
}
