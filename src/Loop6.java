import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loop6 {

    public static void main(String[] args) throws IOException {
        int start = readInput("Please enter the starting value");
        int end = readInput("Please enter the ending value");
        if(start > end){
            throw new RuntimeException("The end value must be larger than the start value");
        }
        printPrime(start,end);
    }

    public static void printPrime(int start, int end) {
        for(int i = start; i <= end; i++){
            boolean isiPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j == 0){
                    isiPrime = false;
                }
            }

            if (isiPrime == true) {
                System.out.println(i + " is prime");
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
