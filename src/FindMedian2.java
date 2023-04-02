import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMedian2 {
    public static void main(String[] args) throws IOException {
        String numberList = readInputString("Enter a list of numbers");
        String[] numberListAsArray = numberList.split(" ");
        int[] numberListAsIntArray = convertStringToIntArray(numberListAsArray);
        int[] sortedNumberList = sort(numberListAsIntArray);
        float median = 0;
        if(sortedNumberList.length%2 == 0){
            median = findEvenMedian(sortedNumberList);
        }else{
            median = findOddMedian(sortedNumberList);
        }

        System.out.println(median);
    }
    public static float findEvenMedian(int[] sortedNumberList){
        int middleNumberSlot1 = (sortedNumberList.length)/2;
        int middleNumberSlot2 = middleNumberSlot1 - 1;
        float median = (float)((sortedNumberList[middleNumberSlot1] + sortedNumberList[middleNumberSlot2])*1.0/2.0);
        return median;
    }
    public static float findOddMedian(int[] sortedNumberList){
        int middleNumberSlot = (sortedNumberList.length-1)/2;
        float median = sortedNumberList[middleNumberSlot];
        return median;
    }
    public static int[] sort(int[] numberListAsIntArray){
        for(int i = 0; i < numberListAsIntArray.length; i++) {
            for (int j = 0; j < numberListAsIntArray.length - 1; j++) {
                if (numberListAsIntArray[j] > numberListAsIntArray[j + 1]) {
                    int num1 = numberListAsIntArray[j];
                    int num2 = numberListAsIntArray[j+1];
                    numberListAsIntArray[j] = num2;
                    numberListAsIntArray[j+1] = num1;
                }
            }
        }
        return numberListAsIntArray;
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
