import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loop1 {
    public static void main(String[] args) throws IOException {
        int start = readInput("Please enter the starting number");
        int end = readInput("Please enter the ending number");
        printOddEven(start,end);
    }

    public static void printOddEven(int start, int end){
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even");
            }
            else{
                System.out.println(i + " is odd");
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
