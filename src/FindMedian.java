import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindMedian {
    public static void main(String[] args) throws IOException {
        String numList = readInputString("Enter a number list");
        String[] numListAsArray = numList.split(" ");
        int[] numListAsIntArray = convertStringToIntArray(numListAsArray);
        int[] sortedNumbers = sort(numListAsIntArray);
        boolean isEven = isEven(sortedNumbers);
        float medianNumber = 0;
        if(isEven = false){
            medianNumber = findMedianForOdd(sortedNumbers);
        }else{
            medianNumber = findMedianForEven(sortedNumbers);
        }
        System.out.println(medianNumber);
    }

    public static float findMedianForOdd(int[] sortedNumbers){
        float medianNumberSlot = (sortedNumbers.length - 1)/2;
        float medianNumber = sortedNumbers[(int) medianNumberSlot];
        return medianNumber;
    }

    public static float findMedianForEven(int[] sortedNumbers){
        float medianNumberSlot = (sortedNumbers.length)/2;
        float rightNumber = sortedNumbers[(int) medianNumberSlot];
        float leftNumber = sortedNumbers[(int) (medianNumberSlot - 1)];
        float medianNumber = (rightNumber + leftNumber)/2;
        return medianNumber;
    }

    public static boolean isEven(int[] sortedNumbers){
        if(sortedNumbers.length%2 == 0) {
            return true;
        }
        return false;
    }

    public static int[] sort(int[] num){
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - 1; j++) {
                if(num[j+1] < num[j]){
                    int num1 = num[j];
                    int num2 = num[j+1];
                    num[j] = num2;
                    num[j+1] = num1;
                }
            }
        }
        return num;
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
