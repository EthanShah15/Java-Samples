import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DuplicateChecker {

    public static void main(String[] args) throws IOException {
        String text = readInputString("Please enter the text you would like to dupe check");
        String[] words = text.split(" ");
        boolean doesItContainADuplicate = doesItContainDuplicates(words);
        if (doesItContainADuplicate == true){
            System.out.println("This text contains a duplicate word");
        }else {
            System.out.println("This text does not contain a duplicate word");
        }

    }

    public static boolean doesItContainDuplicates(String[] words){
        boolean IsItADuplicate = false;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(i != j){
                    if (words[i].equalsIgnoreCase(words[j]) == true){
                        IsItADuplicate = true;
                        break;
                    }
                }
            }
        }
        return IsItADuplicate;
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
