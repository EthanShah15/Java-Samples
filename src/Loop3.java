import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop3 {

    public static void main(String [] args) throws IOException {
        int start = readInput("Please enter the starting value:");
        int end = readInput("Please enter the end value:");
        printMultiplesOf10(start , end);
    }

    public static void printMultiplesOf10(int start, int end){
        for(int i = start; i <= end; i++){
            if(i%10 == 0){
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
