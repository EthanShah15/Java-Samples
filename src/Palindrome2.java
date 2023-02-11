import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Palindrome2 {

    public static void main(String[] args) throws IOException {
        String text = readInputString("Please enter text").toLowerCase();
        char[] textAsArray = text.toCharArray();
        char[] reversedText = reverseText(textAsArray);
//        boolean isItAPalindrome = checkPalindrome(textAsArray,reversedText);
        boolean isItAPalindrome = new String(textAsArray).equals(new String(reversedText));
        if(isItAPalindrome == true){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }
    }

    public static char[] reverseText(char[] textAsArray){
        char[] reversedText = new char[textAsArray.length];
        for(int i = 0; i < textAsArray.length; i++){
            reversedText[i] = textAsArray[textAsArray.length - i - 1];
        }
        return reversedText;
    }



//    public static boolean checkPalindrome(char[] textAsArray, char[] reversedText){
//        boolean isItAPalindrome = true;
//        for(int i = 0; i < textAsArray.length; i++){
//            if(textAsArray[i] != reversedText[i]){
//                isItAPalindrome = false;
//            }
//        }
//        return isItAPalindrome;
//    }
//



    public static String readInputString(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return input;
    }
}
