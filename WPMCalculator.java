public class WPMCalculator {
    public double calculateWPM(int wordsTyped, long elapsedTime) {
        double minutes = elapsedTime / 60000.0;

        // prevent division by 0
        assert(minutes != 0);

        return wordsTyped / minutes;
    }
}
