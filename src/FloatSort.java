import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FloatSort {

    public static void main(String[] args) throws IOException {
        String numbers = readInputString("Please enter the numbers you would like to sort");
        String[] numbersAsStringArray = numbers.split(" ");
        Float[] numberAsFloatArray = convertStringToFloatArray(numbersAsStringArray);
        Float[] sortedNumbers = sortNumbers(numberAsFloatArray);
        System.out.println(Arrays.toString(sortedNumbers));
    }

    public static Float[] sortNumbers(Float[] numbers){
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length - 1; j++){
            if (numbers[j] > numbers[j + 1]) {
                Float num1 = numbers[j];
                Float num2 = numbers[j + 1];
                numbers[j] = num2;
                numbers[j + 1] = num1;
                }
            }
        }
        return numbers;
    }

    public static Float[] convertStringToFloatArray(String[] numbersAsStringArray) {
        Float[] intarray = null;

        if (numbersAsStringArray != null) {
            intarray = new Float[numbersAsStringArray.length];

            try {
                for (int i = 0; i < numbersAsStringArray.length; i++) {
                    intarray[i] = Float.parseFloat(numbersAsStringArray[i]);
                }
            } catch (NumberFormatException e) {

            }
        }

        return intarray;
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
