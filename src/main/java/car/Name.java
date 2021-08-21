package car;

public class Name {
    public static final int MAX_LENGTH = 5;
    private String value;

    public Name(String value) {
        checkLength(value);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private void checkLength(String value) {
        if (value.length() > MAX_LENGTH) {
            throw new IllegalArgumentException();
        }
    }
}
