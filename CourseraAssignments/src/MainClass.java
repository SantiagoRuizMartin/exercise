import java.io.IOException;

/**
 * Created by SantiagoRuiz on 16/12/2015.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        DiceRolling d = new DiceRolling();
        d.simulates(10000);
    }
}
