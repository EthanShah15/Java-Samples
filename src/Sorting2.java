import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Sorting2 {

    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Please enter a few numbers you would like to sort from least to greatest");
        String[] numberListAsString = numberList.split(" ");
        int[] numberListAsInt = convertStringToInt(numberListAsString);
        int[] sortedNumberList = sortIntegers(numberListAsInt);
        System.out.println(Arrays.toString(sortedNumberList));
    }

    public static int[] convertStringToInt(String[] numberListAsString){
        int[] numberListAsInt = new int[numberListAsString.length];
        for(int i = 0; i < numberListAsString.length; i++){
            numberListAsInt[i] = Integer.parseInt(numberListAsString[i]);
        }
        return numberListAsInt;
    }

    public static int[] sortIntegers(int[] numberListAsInt){
        for(int i = 0; i < numberListAsInt.length; i++){

            boolean didWeSwap = false;

            for(int j = 0; j < numberListAsInt.length - 1; j++){
                if (numberListAsInt[j] > numberListAsInt[j + 1]){
                    didWeSwap = true;
                    int tempNumber1 = numberListAsInt[j];
                    int tempNumber2 = numberListAsInt [j + 1];
                    numberListAsInt[j] = tempNumber2;
                    numberListAsInt[j + 1] = tempNumber1;
                }
            }

            if (didWeSwap == false){

                break;
            }
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
