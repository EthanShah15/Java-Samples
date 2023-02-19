import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition2D {
    public static void main(String[] args) throws IOException {
        int dimensions = readInputNumber("Please enter the dimensions of the box");
        int[][] grid = makeGrid(dimensions);
        fillGrid(grid);
        printGrid(grid);
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf("%d ", grid[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] makeGrid(int dimensions){
        int[][] grid = new int[dimensions][dimensions];
        for (int row = 0; row < dimensions; row++){
            grid[row][0] = row + 1;
            grid[row][1] = row + 1;
        }
        return grid;
    }

    public static void fillGrid(int[][] grid){
        for(int row = 0; row < grid.length; row++) {
            for (int column = 2; column < grid.length; column++) {
                grid[row][column] = 0;
                 for (int internalColumn = 0; internalColumn < column; internalColumn++){
                     grid[row][column] = grid[row][internalColumn] + grid[row][column];
                 }
            }
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
