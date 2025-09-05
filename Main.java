import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordBank wordBank = new WordBank();
        WPMCalculator calculator = new WPMCalculator();

        System.out.println("Choose mode: 1 = Timed Test, 2 = Word Count Test");
        int choice = scanner.nextInt();

        GameMode game;
        if (choice == 1) {
            game = new TimedMode(wordBank, calculator, 5);
        } else {
            // time mode doesnt work lol
            game = new WordCountMode(wordBank, calculator, 15);
        }

        game.startGame();
    }
}
