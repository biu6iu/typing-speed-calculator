public class WPMCalculator {
    public double calculateWPM(String words, long elapsedTime) {
        double minutes = elapsedTime / 60000.0;
        String[] wordsInList = words.split("\\s+");
        int wordLength = wordsInList.length;

        // prevent division by 0
        assert(minutes != 0);

        return wordLength / minutes;
    }
}
