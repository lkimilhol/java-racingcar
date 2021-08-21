package car;

public class Position {
    private int progress;

    public Position() {
        this.progress = 0;
    }

    public Position(int progress) {
        checkProgress(progress);
        this.progress = progress;
    }

    public int getProgress() {
        return progress;
    }

    private void checkProgress(int progress) {
        if (progress < 0) {
            throw new IllegalArgumentException();
        }
    }
}
