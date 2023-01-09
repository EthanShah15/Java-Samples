import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StringExample4 {

    public static void main(String[] args) throws IOException {
        String sentence = readInputString("Please enter a sentence");
        sentence = sentence.toLowerCase();
        String [] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            String word = words [i];
            word = toCamelCase(word);
            words [i] = word;
        }
        String output = String.join(" ", words);
        System.out.println(output);
    }

    public static String toCamelCase(String word){
        String leftWord = word.substring(0,1);
        String rightWord = word.substring(1,word.length());
        word = leftWord.toUpperCase() + rightWord;
        return word;
    }

    public static String readInputString(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return input;
    }
}
