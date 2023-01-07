import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop5 {

    public static void main(String [] args) throws IOException {
        int start = readInput("Please enter the starting value:");
        int end = readInput("Please enter the end value:");
        printPrime(start , end);
    }

    public static void printPrime(int start, int end){
        for(int i = start; i <= end; i++){
            boolean isIprime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0) {
                    isIprime = false;
                }


            }
            if(isIprime == true){
                System.out.println(i);
            }
        }
    }

    public static int readInput(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return Integer.parseInt(input);
    }
}
