import java.util.*;

public class WordBank {
    private List<String> words;

    public WordBank() {
        // For now, hardcoded list but will expand later
        words = Arrays.asList(
                "apple", "banana", "cat", "dog", "elephant",
                "fast", "slow", "java", "keyboard", "screen",
                "code", "computer", "mouse", "phone", "table"
        );
    }

    // Return n random words
    public List<String> getRandomWords(int n) {
        Collections.shuffle(words);
        return words.subList(0, Math.min(n, words.size()));
    }
}
