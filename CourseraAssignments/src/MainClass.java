import java.io.IOException;

/**
 * Created by SantiagoRuiz on 16/12/2015.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        WordPlay w = new WordPlay();
        CeasarCipher ce = new CeasarCipher();
        System.out.println(ce.encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 15));
//        System.out.println(ce.encrypt("At noon be in the conference room with your hat on for a surprise party. YELL LOUD!", 21));
//        ce.testCesar();
    }
}
