import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindMean {
    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Please enter a number list");
        String[] numberListSplit = numberList.split(" ");
        int[] numberListAsInt = convertStringToIntArray(numberListSplit);
        float mean = findMean(numberListAsInt);
        System.out.println("the mean is " + mean);
    }

    public static float findMean(int[] numberListAsInt){
        float currentSum = 0;
        for(int i = 0; i < numberListAsInt.length; i++){
            currentSum = currentSum + numberListAsInt[i];
        }
        float mean = currentSum/numberListAsInt.length;
        return mean;
    }

    public static int[] convertStringToIntArray(String[] numberListSplit){
        int[] numberListAsInt = new int[numberListSplit.length];
        for(int i = 0; i < numberListSplit.length; i++){
            numberListAsInt[i] = Integer.parseInt(numberListSplit[i]);
        }
        return numberListAsInt;
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
