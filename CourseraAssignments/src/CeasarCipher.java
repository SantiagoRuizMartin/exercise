import java.io.*;

/**
 * Created by SantiagoRuiz on 22/12/2015.
 */
public class CeasarCipher {

    public String encrypt(String input, int key) {

        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        String shiftedAlphabet2 = alphabet2.substring(key) + alphabet2.substring(0, key);
        for (int i = 0; i < encrypted.length(); i++) {
            char currChar = encrypted.charAt(i);
            if (Character.isUpperCase(currChar)) {
                int idx = alphabet.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            } else {
                int idx = alphabet2.indexOf(currChar);
                if (idx != -1) {
                    char newChar = shiftedAlphabet2.charAt(idx);
                    encrypted.setCharAt(i, newChar);
                }
            }
        }
        return encrypted.toString();
    }

    public String encryptTwoKeys(String input, int key, int key2) {

        StringBuilder encrypted = new StringBuilder(input);
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabet2 = "abcdefghijklmnopqrstuvwxyz";
        String shiftedAlphabet = alphabet.substring(key) + alphabet.substring(0, key);
        String shiftedAlphabet2 = alphabet2.substring(key) + alphabet2.substring(0, key);
        String shiftedAlphabet3 = alphabet.substring(key2) + alphabet.substring(0, key2);
        String shiftedAlphabet4 = alphabet2.substring(key2) + alphabet2.substring(0, key2);
        for (int i = 0; i < encrypted.length(); i++) {
            if ((i + 1) % 2 != 0) {
                char currChar = encrypted.charAt(i);
                if (Character.isUpperCase(currChar)) {
                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlphabet.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                } else {
                    int idx = alphabet2.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlphabet2.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }
            } else {
                char currChar = encrypted.charAt(i);
                if (Character.isUpperCase(currChar)) {
                    int idx = alphabet.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlphabet3.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                } else {
                    int idx = alphabet2.indexOf(currChar);
                    if (idx != -1) {
                        char newChar = shiftedAlphabet4.charAt(idx);
                        encrypted.setCharAt(i, newChar);
                    }
                }

            }
        }
        return encrypted.toString();
    }


    public void testCesar() throws IOException {
        int key = 8;
        int key2 = 21;
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("D:\\JetBrainsProyects\\CourseraExercises\\CourseraAssignments\\src\\example.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String message = br.readLine();
        String encrypted = encryptTwoKeys(message, key,key2);
        System.out.println("key is " + key + "\n" + encrypted);

    }
}
