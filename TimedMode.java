public class TimedMode implements GameMode {
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
    }
}