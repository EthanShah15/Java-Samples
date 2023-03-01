import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindBiggestNumber {
    public static void main(String[] args) throws IOException {
        String numbers = readInputString("Please enter your numbers");
        String[] numbersAsStringArray = numbers.split(" ");
        int[] numbersAsIntArray = convertStringToInt(numbersAsStringArray);
        int biggestNumber = findBiggestNumber(numbersAsIntArray);
        System.out.println("The biggest number in your list is " + biggestNumber);
    }

    public static int[] convertStringToInt(String[] numbersAsStringArray){
        int[] numbersAsIntArray = new int[numbersAsStringArray.length];
        for(int i = 0; i < numbersAsStringArray.length; i++){
            numbersAsIntArray[i] = Integer.parseInt(numbersAsStringArray[i]);
        }
        return numbersAsIntArray;
    }

    public static int findBiggestNumber(int[] numbersAsIntArray){
        int biggestNumber = numbersAsIntArray[0];
        for(int i = 0; i < numbersAsIntArray.length; i++){
            if(biggestNumber < numbersAsIntArray[i]){
                biggestNumber = numbersAsIntArray[i];
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
