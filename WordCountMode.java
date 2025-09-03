public class WordCountMode implements GameMode {
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


    }
}
