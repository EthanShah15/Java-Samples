import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TwoDimension {

    public static void main(String[] args) throws IOException {
        String[] row1 = readInputString("Enter line 1").split(" ");
        String[] row2 = readInputString("Enter line 2").split(" ");
        String[] row3 = readInputString("Enter line 3").split(" ");
        String[][] grid = new String[row1.length][row1.length];
        grid[0] = row1;
        grid[1] = row2;
        grid[2] = row3;
        System.out.println("grid[0][1] = " + grid[0][1]);
        boolean isItAWin = checkDiagonalWinRightToLeft(grid);
        System.out.println("is it a win = " + isItAWin);
    }

    public static boolean checkDiagonalWinLeftToRight(String[][] grid){
        boolean isItAWin = true;
        String startValue = grid[0][0];
        for(int x = 0; x < grid[0].length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(x == y){
                    if (!startValue .equals(grid[x][y])){
                        isItAWin = false;
                        break;
                    }
                }
            }
        }
        return isItAWin;
    }

    public static boolean checkDiagonalWinRightToLeft(String[][] grid){
        boolean isItAWin = true;
        String startValue = grid[grid[0].length - 1][0];
        int x = grid[0].length - 1;
        int y = 0;
        while(x >= 0){
            if(!grid[x][y].equals(startValue)){
                isItAWin = false;
                break;
            }
            x--;
            y++;
        }
        return isItAWin;
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
