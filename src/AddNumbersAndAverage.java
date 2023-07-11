import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AddNumbersAndAverage {
    public static void main(String[] args) throws IOException{
        String numbers = readInputString("Please enter your numbers");
        String[] numberList = numbers.split(" ");
        int[] numberListAsInt = convertStringToIntArray(numberList);
        int sum = addNumbers(numberListAsInt);
        float average = findAverage(numberListAsInt);
        System.out.println("The sum of your numbers is " + sum + " The average of your numbers is " + average);
    }

    public static int[] convertStringToIntArray(String[] numberListSplit){
        int[] numberListAsInt = new int[numberListSplit.length];
        for(int i = 0; i < numberListSplit.length; i++){
            numberListAsInt[i] = Integer.parseInt(numberListSplit[i]);
        }
        return numberListAsInt;
    }

    public static float findAverage(int[] numberList){
        int sum = 0;
        for(int i = 0; i < numberList.length; i++){
            sum = numberList[i] + sum;
        }
        float average = (float)(sum * 1.0)/numberList.length;
        return average;
    }

    public static int addNumbers(int[] numberList){
        int sum = 0;
        for(int i = 0; i < numberList.length; i++){
            sum = numberList[i] + sum;
        }
        return sum;
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
