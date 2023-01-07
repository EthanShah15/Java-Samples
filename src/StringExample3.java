import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExample3 {

    public static void main(String[] args) throws IOException {
        String name = readInputString("Please enter your first name");
        name = convertToCamelCase(name);
        System.out.println(name);
        System.out.println("Hello1");
    }

    private static String convertToCamelCase(String name) {
        name = name.toLowerCase();
        String partLeft = name.substring(0,1);
        String partRight = name.substring(1,name.length());
        partLeft = partLeft.toUpperCase();
        name = partLeft+partRight;
        return name;
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
