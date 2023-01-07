import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExample {

    public static void main(String [] args) throws IOException {
        String name = readInputString("Please enter your first name ");
        System.out.println("Hello " + name.toUpperCase());
    }

    public static String readInputString(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return input;
    }
}
