import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Pyramid {

    public static void main(String[] args) throws IOException {
        int base = readInputNumber("Please enter your number");
        for (int i = 0; i <= base; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
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
