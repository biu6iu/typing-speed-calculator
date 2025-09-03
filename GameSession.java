import java.util.List;

public class GameSession {
    private List<String> wordsToType;
    private long startTime;
    private long endTime;

    public GameSession(List<String> wordsToType) {
        this.wordsToType = wordsToType;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void end() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public List<String> getWordsToType() {
        return wordsToType;
    }
}
