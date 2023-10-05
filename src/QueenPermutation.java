import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//TODO: return first permutation
//TODO: change code to support 8 queens
//TODO: return all permutations
public class QueenPermutation {

    public static void main(String[] args) throws IOException {
        String[][] permutations = x2Grid();
    }
    public static String[][] x2Grid() throws IOException {
        int[][] array = new int[8][8];
        String[][] queenPermutations = new String[1][2];
        for (int queen1Row = 0; queen1Row < 8; queen1Row++) {
            for (int queen1Col = 0; queen1Col < 8; queen1Col++) {
                for (int queen2Row = 0; queen2Row < 8; queen2Row++) {
                    for (int queen2Col = 0; queen2Col < 8; queen2Col++) {
                        array[queen1Row][queen1Col] = 1;
                        array[queen2Row][queen2Col] = 1;
                        printGrid(array);
                        System.out.println("\n");
                        if(queenPermutations[0][0] == null) {
                            //*if(queenPermutations[0][0])
                            queenPermutations[0][0] = queen1Row + "" + "," + queen1Col + "";
                            queenPermutations[0][1] = queen2Row + "" + "," + queen2Col + "";
                        }
                        array[queen1Row][queen1Col] = 0;
                        array[queen2Row][queen2Col] = 0;
                    }
                }
            }
        }
        return queenPermutations;
    }


    public static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
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
