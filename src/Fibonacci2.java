import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {

    public static void main(String[] args) throws IOException {
        int maxLimit = readInputNumber("Please enter the max limit");

        printFibonacci(maxLimit);
    }

    public static void printFibonacci(int maxLimit) {
        int number1 = 1;
        int number2 = 1;
        for (int i = 1; i <= maxLimit; i++) {

            if (number1 <= maxLimit) {
                System.out.println(number1);
            }else {
                break;
            }


            if (number2 <= maxLimit) {
                System.out.println(number2);
            }else {
                break;
            }

            number1 = number1 + number2;
            number2 = number1 + number2;


        }
    }


    public static int readInputNumber(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return Integer.parseInt(input);
    }
}

