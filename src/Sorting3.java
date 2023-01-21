import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Sorting3 {

    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Please enter a list of numbers you would like to sort. eg: 1 2 3 4 5");
        String[] numberListAsString = numberList.split(" ");
        int[] numberListAsInt = convertToInt(numberListAsString);
        int[] sortedNumbers = sortNumbers(numberListAsInt);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static int[] convertToInt(String[] numberListAsString) {
        int[] numberListAsInt = new int[numberListAsString.length];
        for (int i = 0; i < numberListAsString.length; i++) {
            numberListAsInt[i] = Integer.parseInt(numberListAsString[i]);
        }
        return numberListAsInt;
    }

    public static int[] sortNumbers(int[] numberListAsInt) {

        for (int i = 0; i < numberListAsInt.length; i++) {
            for (int j = 0; j < numberListAsInt.length - 1; j++) {
                if (numberListAsInt[j] > numberListAsInt[j + 1]) {
                    int tempNumber1 = numberListAsInt[j];
                    int tempNumber2 = numberListAsInt[j + 1];
                    numberListAsInt[j] = tempNumber2;
                    numberListAsInt[j + 1] = tempNumber1;
                }
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


