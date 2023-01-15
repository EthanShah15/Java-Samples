import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome {

    public static void main(String[] args) throws IOException {
        String text = readInputString("Please enter text to verify that it is a palindrome");
        text = text.replace(" ", "");
        char[] characters = text.toCharArray();
        boolean IsItAPalindrome = checkIfPalindrome(characters);
        System.out.println(IsItAPalindrome);
    }

    public static boolean checkIfPalindrome(char[] characters){
        boolean IsItAPalindrome = true;
        for(int i = 0; i < characters.length/2; i++){
            if(characters[i] != characters[characters.length - i - 1]){
                IsItAPalindrome = false;
                break;
            }

        }
        return IsItAPalindrome;
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
