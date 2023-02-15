import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2d {
    public static void main(String[] args) throws IOException {
        int dimensions = readInputNumber("Please enter the dimensions of the fibonacci square");
        int[][] grid = createGrid(dimensions);
        int[][] filledGrid = fillGrid(grid,dimensions);

        for (int row = 0; row < dimensions; row++) {
            for (int column = 0; column < dimensions; column++) {
                System.out.print(grid[row][column] + " ");
            }
            System.out.println("");
        }
    }

    public static int[][] createGrid(int dimensions){
        int[][] grid = new int[dimensions][dimensions];
        for(int row = 0; row < dimensions; row++){
                grid[row][0] = row + 1;
                grid[row][1] = row + 1;
        }
        return grid;
    }

    public static int[][] fillGrid(int[][] grid, int dimensions){
        for(int row = 0; row < dimensions; row++){
            for(int column = 2; column< dimensions; column++)
            grid[row][column] = grid[row][column - 2] + grid[row][column - 1];
        }
        return grid;
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
