import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FibonacciTest {
    public static void main(String[] args) throws IOException {
        int sequence = readInputNumber("Please enter the number of digits you would like print");
        Fibonacci(sequence);
    }

    public static void Fibonacci(int sequence){
        int firstNum = 1;
        int secondNum = 1;
        for(int i = 1; i <= sequence/2; i++){
            System.out.println(firstNum);
            System.out.println(secondNum);
            firstNum = firstNum + secondNum;
            secondNum = firstNum + secondNum;
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
