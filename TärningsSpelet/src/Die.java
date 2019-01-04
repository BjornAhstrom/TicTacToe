import java.util.Random;

public class Die {

    private int currentValue;
    private int sides;
    private Random random;

    public Die(int sides) {
        random = new Random();
        this.sides = sides;
        roll();
    }

    public int getSides() {
        return this.sides;
    }

    public int getCurrentValue() {
        return this.currentValue;
    }

    public void roll() {

        this.currentValue = this.random.nextInt(sides) + 1;
    }


}
