package Das.Manjusha;

/**
 * Created by manjushadas on 4/30/16.
 */
public class App {

    public static void main(String[]args) {

        Game game = new Game();
        game.secretNum()    ;
        game.startGame();
        game.guessNum();
        game.compareNums();
        game.countTotalGuesses();
    }
}
