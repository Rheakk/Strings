import java.util.ArrayList;

public class Main {

    public static void addChar(String word, char c){
        ArrayList<Character> list = new ArrayList<>();
        for (char ch : word.toCharArray()){
            list.add(ch);
        }
        ArrayList<String> newWords = new ArrayList<>();


    }

    public static void main(String[] args) {
	// write your code here
        String s = "abcdefgh";
        String b = s.replaceAll("[^a-f]", "x");
        System.out.println(b);

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            addChar("rhea", alphabet);
        }
    }
}
