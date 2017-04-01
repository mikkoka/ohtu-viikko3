package ohtu;

public class Multiplier {
    private int value;
    public Multiplier(int value) {
        this.value = value + 1;
    }

    public int multipliedBy(int other) {
        return value * other;
    }

}