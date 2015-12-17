/**
 * Created by SantiagoRuiz on 16/12/2015.
 */
public class MainClass {
    public static void main(String[] args) {
        WordPlay w = new WordPlay();
        System.out.println(w.isVowel('a'));
        System.out.println(w.isVowel('A'));
        System.out.println(w.replaceVowels("Hello Word",'*'));
    }
}
