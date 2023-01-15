import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Sorting1 {

    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Please enter the values you would like to sort (eg:1 5 7 6 8) ");
        String [] numberListAsString = numberList.split(" ");
        int[] numberListAsInteger = convertStringArrayToInteger(numberListAsString);
    }

    public static int[] convertStringArrayToInteger(String[] numberListAsString){
        int[] numberListAsInteger = new int[numberListAsString.length];
        for(int i = 0; i < numberListAsString.length; i++){
            numberListAsInteger[i] = Integer.parseInt(numberListAsString[i]);
        }
        return numberListAsInteger;
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
