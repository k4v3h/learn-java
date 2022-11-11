package designpatterns.template;

public class Tankfight extends Game {
    @Override
    public void initialize() {
        System.out.println("Tankfight game initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Tankfight game started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Tankfight game finished!");
    }
}
