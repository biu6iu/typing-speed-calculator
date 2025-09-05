import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimedMode extends GameMode {
    private WordBank wordBank;
    private WPMCalculator calculator;
    private int timeLimitSeconds;

    public TimedMode(WordBank wordBank, WPMCalculator calculator, int timeLimitSeconds) {
        this.wordBank = wordBank;
        this.calculator = calculator;
        this.timeLimitSeconds = timeLimitSeconds;
    }

    @Override
    public void startGame() {
        // TODO: implement console-based timed typing test
        // 1. Display random words
        // 2. Record input until time runs out
        // 3. Use calculator to compute WPM
        int wordTarget = 50;
        List<String> words = wordBank.getRandomWords(wordTarget);
        Scanner scanner = new Scanner(System.in);
        GameSession gameSession = new GameSession(words);

        System.out.println("You have " + this.timeLimitSeconds + "s to type these words!");
        // countdown
        countdown();

        // print out each word
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.print("\n");

        // start game
        gameSession.start();

        // timer
        int time = 0;
        while (time < this.timeLimitSeconds) {
            // increment time every second
            try {
                TimeUnit.SECONDS.sleep(1);
                time += 1;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String typedWords = scanner.nextLine();
        System.out.println("stop!");
        gameSession.end();



        // calculate score
        long timeElapsed = gameSession.getElapsedTime();
        double WPM = calculator.calculateWPM(typedWords, timeElapsed);
        System.out.println("Your WPM: " + String.format("%.2f", WPM));
    }
}