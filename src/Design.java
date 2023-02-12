import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Design {

    public static void main(String[] args) throws IOException {
        int inputNumber = readInputNumber("Please enter a number");
        draw(inputNumber);
    }

    public static void draw(int inputNumber) {
        for (int line = 0; line < inputNumber; line++) {
            for (int column = 0; column < inputNumber; column++) {
                if (line != inputNumber - 1) {
                    if (column == 0 || column == inputNumber - 1) {
                        System.out.print("○");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("○");
                }
            }
            System.out.print("\n");
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
