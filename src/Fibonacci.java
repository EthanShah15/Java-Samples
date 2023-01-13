import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Fibonacci {

    public static void main(String[] args) throws IOException {
        long totalDigits = readInputNumber("Please enter how many digits of fibonacci you want");
        printSeries(totalDigits);
    }

    public static void printSeries(long totalDigits){
        BigInteger number1 = new BigInteger("1");
        BigInteger number2 = new BigInteger("1");
        for(int i = 1; i <= totalDigits/2; i++){
            System.out.println(number1);
            System.out.println(number2);
            number1 = number1.add(number2);
            number2 = number1.add(number2);
        }
    }

    public static long readInputNumber(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return Long.parseLong(input);
    }


}
