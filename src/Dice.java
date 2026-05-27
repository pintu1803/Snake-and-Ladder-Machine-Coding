import java.util.Random;

class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        // return (int) (Math.random() * sides) + 1;
        return new Random().nextInt(sides) + 1;
    }
}