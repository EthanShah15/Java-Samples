import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindBiggestNumber2 {
    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Please enter a list of numbers");
        String[] numberListAsStringArray = numberList.split(" ");
        int[] numberListAsIntArray = convertStringToInt(numberListAsStringArray);
        int biggestNumber = FindBiggestNumber(numberListAsIntArray);
        System.out.println(biggestNumber);
    }

    public static int[] convertStringToInt(String[] numberListAsStringArray){
        int[] numberListAsIntArray = new int[numberListAsStringArray.length];
        for(int i = 0; i < numberListAsStringArray.length; i++){
            numberListAsIntArray[i] = Integer.parseInt(numberListAsStringArray[i]);
        }
        return numberListAsIntArray;
    }

    public static int FindBiggestNumber(int[] numberListAsIntArray){
        int biggestNumber = numberListAsIntArray[0];
        for(int i = 0; i < numberListAsIntArray.length; i++){
            if(biggestNumber < numberListAsIntArray[i]){
                biggestNumber = numberListAsIntArray[i];
            }
        }
        return biggestNumber;
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
