import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loop2 {
    public static void main(String[] args) throws IOException {
        int start = readInput("Please enter the start value");
        int end = readInput("Please enter the end value");
        printMultipleOf5(start,end);
    }



    public static void printMultipleOf5(int start, int end){
        for(int i = start; i <= end; i++){
            if(i%5 == 0) {
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
