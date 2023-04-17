import java.util.Random;

public class Dice {
    public static Integer getDiceValue() {
        return new Random().nextInt(6)+1;
    }
}
