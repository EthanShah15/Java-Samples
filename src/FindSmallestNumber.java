import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindSmallestNumber {
    public static void main(String[] args) throws IOException {
        String numberListAsString = readInputString("Please enter a list of numbers");
        String[] numberListSplit = numberListAsString.split(" ");
        int[] numberListAsInt = convertStringToIntArray(numberListSplit);
        int smallestNumber = checkSmallestNumber(numberListAsInt);
        System.out.println("The smallest number in the list is " + smallestNumber);
    }

    public static int[] convertStringToIntArray(String[] numberListSplit){
        int[] numberListAsInt = new int[numberListSplit.length];
        for(int i = 0; i < numberListSplit.length; i++){
            numberListAsInt[i] = Integer.parseInt(numberListSplit[i]);
        }
        return numberListAsInt;
    }

    public static int checkSmallestNumber(int[] numberListAsInt){
        int smallestNumber = numberListAsInt[0];
        for(int i = 0; i < numberListAsInt.length; i++){
            if(smallestNumber > numberListAsInt[i]){
                smallestNumber = numberListAsInt[i];
            }
        }
        return smallestNumber;
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
