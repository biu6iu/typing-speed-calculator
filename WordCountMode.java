import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Scanner;

public class WordCountMode extends GameMode {
    private WordBank wordBank;
    private WPMCalculator calculator;
    private int wordTarget;

    public WordCountMode(WordBank wordBank, WPMCalculator calculator, int wordTarget) {
        this.wordBank = wordBank;
        this.calculator = calculator;
        this.wordTarget = wordTarget;
    }

    @Override
    public void startGame() {
        // TODO: implement console-based word count typing test
        // 1. Display random words (wordTarget amount)
        // 2. Record input until all words typed
        // 3. Use calculator to compute WPM
        List<String> words = wordBank.getRandomWords(wordTarget);
        Scanner scanner = new Scanner(System.in);
        GameSession gameSession = new GameSession(words);
        System.out.println("Type " + this.wordTarget + " words as fast as you can!");

        // count down
        countdown();

        // print out each word
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.print("\n");

        // start game
        gameSession.start();
        String typedWords = scanner.nextLine();
        gameSession.end();

        // calculate score
        long timeElapsed = gameSession.getElapsedTime();
        double WPM = calculator.calculateWPM(typedWords, timeElapsed);
        System.out.println("Your WPM: " + String.format("%.2f", WPM));
    }
}
