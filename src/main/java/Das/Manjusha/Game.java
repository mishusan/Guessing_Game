package Das.Manjusha;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by manjushadas on 4/30/16.
 */
public class Game {

        public int totalGuess = 0;
        public int previousGuess = 0;
        public Random random = new Random();
        public int randomNum;
        public int value;
        public Scanner scanner = new Scanner(System.in);


        public int secretNum(){
            randomNum = random.nextInt(100)+1;
            return randomNum;
        }

        public void startGame(){
            System.out.println("Can you guess my secret number between 1 and 100?: ");
        }

        public void guessNum() {
            value = scanner.nextInt();
        }

        public void compareNums() {
            while (value != randomNum) {

                if (value < randomNum) {
                    System.out.println("Too Small! Guess again..");
                    previousGuess = value;
                    guessNum();
                    countTotalGuesses();
                }

                if (value > randomNum) {
                    System.out.println("Too large! Guess again..");
                    previousGuess = value;
                    guessNum();
                    countTotalGuesses();
                }

                if (value == randomNum) {
                    countTotalGuesses();
                    System.out.println("Just right! You took " + totalGuess + " guesses!");
                }
            }
        }
        public int countTotalGuesses(){
            if (value != previousGuess) {
                totalGuess++;
            }
            return totalGuess;
        }

}



