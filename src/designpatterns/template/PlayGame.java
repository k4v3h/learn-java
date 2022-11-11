package designpatterns.template;

import java.util.List;
import java.util.ArrayList;

public class PlayGame {
    public static void main(String[] args) {
        List<Game> games = new ArrayList<>();
        games.add(new Mario());
        games.add(new Tankfight());

        for (Game game: games) {
            game.play();
        }
    }
}
