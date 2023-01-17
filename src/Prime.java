import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime {

    public static void main(String[] args) throws IOException {
        int startNumber = readInputNumber("Please enter the starting digit");
        int endNumber = readInputNumber("Please enter the ending digit");
        printPrime(startNumber,endNumber);
    }

    public static void printPrime(int startNumber, int endNumber) {
        for (int i = startNumber; i <= endNumber; i++) {
            boolean IsItPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    IsItPrime = false;
                    break;
                }
            }
            if (IsItPrime == true){
                System.out.println(i);
            }
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
