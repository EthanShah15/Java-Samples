import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop4 {

    public static void main(String [] args) throws IOException {
        int start = readInput("Please enter the starting value:");
        int end = readInput("Please enter the end value:");
        printSquares2(start , end);
    }

    public static void printSquares1(int start, int end){
        for(int i = 0; i <= end; i++){
            int square = (i * i);
            if(square >= start && square <= end){
                System.out.println(square);
            }
        }

    }


    public static void printSquares2(int start, int end){
        for(int i = start; i <= end; i++){
            for(int j = 0; j<= i; j++){
                if((j*j) == i){
                    System.out.println(i);
                }
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
