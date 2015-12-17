/**
 * Created by SantiagoRuiz on 16/12/2015.
 */
public class WordPlay {

    public boolean isVowel(char ch) {
        char pChar = ch;
        if (pChar == 'a' || pChar == 'e' || pChar == 'i' || pChar == 'o' || pChar == 'u'
                || pChar == 'A' || pChar == 'E' || pChar == 'I' || pChar == 'O' || pChar == 'U') {
            return true;
        }
        return false;
    }

    public String replaceVowels(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for(int i =0; i<phrase.length();i++){
            if(isVowel(phrase.charAt(i))){
                sb.setCharAt(i, ch);
            }
        }
        return sb.toString();
    }

    public String emphasize(String phrase, char ch){
        StringBuilder sb = new StringBuilder(phrase);
        for (int i=0;i<phrase.length();i++){
            
        }
        return null;
    }
}

