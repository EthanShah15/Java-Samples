import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class EightQueens {
    public static void main(String[] args) throws IOException {
        String[] queenPosition1 = readInputString("Enter queen 1's position").split(",");
        String[] queenPosition2 = readInputString("Enter queen 2's position").split(",");
        String[] queenPosition3 = readInputString("Enter queen 3's position").split(",");
        String[] queenPosition4 = readInputString("Enter queen 4's position").split(",");
        String[] queenPosition5 = readInputString("Enter queen 5's position").split(",");
        String[] queenPosition6 = readInputString("Enter queen 6's position").split(",");
        String[] queenPosition7 = readInputString("Enter queen 7's position").split(",");
        String[] queenPosition8 = readInputString("Enter queen 8's position").split(",");
        String[][] grid = new String[8][8];
        grid[0] = queenPosition1;
        grid[1] = queenPosition2;
        grid[2] = queenPosition3;
        grid[3] = queenPosition4;
        grid[4] = queenPosition5;
        grid[5] = queenPosition6;
        grid[6] = queenPosition7;
        grid[7] = queenPosition8;

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
