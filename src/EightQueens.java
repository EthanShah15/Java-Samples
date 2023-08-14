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
        String[] queenPositions = new String[8];
        queenPositions[0] = queenPosition1[0] + "," + queenPosition1[1];
        queenPositions[1] = queenPosition2[0] + "," + queenPosition2[1];
        queenPositions[2] = queenPosition3[0] + "," + queenPosition3[1];
        queenPositions[3] = queenPosition4[0] + "," + queenPosition4[1];
        queenPositions[4] = queenPosition5[0] + "," + queenPosition5[1];
        queenPositions[5] = queenPosition6[0] + "," + queenPosition6[1];
        queenPositions[6] = queenPosition7[0] + "," + queenPosition7[1];
        queenPositions[7] = queenPosition8[0] + "," + queenPosition8[1];
        boolean noXConflict = checkXValues(queenPositions);
        boolean noYConflict = checkYValues(queenPositions);
        boolean noDiagonalConflict = checkDiagonalValues(queenPositions);
        if (noXConflict && noYConflict && noDiagonalConflict) {
            System.out.println("These values work");
        } else {
            System.out.println("These values don't work");
        }
    }

    public static int getX(String queenPosition) {
        return Integer.parseInt(queenPosition.split(",")[0]);
    }

    public static int getY(String queenPosition) {
        return Integer.parseInt(queenPosition.split(",")[1]);
    }

    public static boolean checkXValues(String[] queenPositions) {
        boolean noConflict = true;
        for (int i = 0; i < queenPositions.length; i++) {
            for (int j = i + 1; j < queenPositions.length; j++) {
                int currentXValue = getX(queenPositions[i]);
                int checkingValue = getX(queenPositions[j]);
                if (currentXValue >= 0 && checkingValue >= 0 && currentXValue < 8 && checkingValue < 8) {
                    if (currentXValue == checkingValue) {
                        System.out.println(i + " and " + j + " are conflicting on the x axis");
                        return false;
                    }
                }
            }
        }
        return noConflict;
    }

    public static boolean checkYValues(String[] queenPositions) {
        boolean noConflict = true;
        for (int i = 0; i < queenPositions.length; i++) {
            for (int j = i + 1; j < queenPositions.length; j++) {
                int currentYValue = getY(queenPositions[i]);
                int checkingValue = getY(queenPositions[j]);
                if (currentYValue >= 0 && checkingValue >= 0 && currentYValue < 8 && checkingValue < 8) {
                    if (currentYValue == checkingValue) {
                        System.out.println(i + " and " + j + " are conflicting on the y axis");
                        return false;
                    }
                }
            }
        }
        return noConflict;
    }

    public static boolean checkDiagonalValues(String[] queenPositions) {
        boolean noConflict = true;
        for (int i = 0; i < queenPositions.length; i++) {
            for (int j = i + 1; j < queenPositions.length; j++) {
                int currentXValue = getX(queenPositions[i]);
                int currentYValue = getY(queenPositions[i]);
                int checkingXValue = getX(queenPositions[j]);
                int checkingYValue = getY(queenPositions[j]);
                if (currentXValue >= 0 && currentYValue >= 0 && currentXValue < 8 && currentYValue < 8 && checkingXValue >= 0 && checkingYValue >= 0 && checkingXValue < 8 && checkingYValue < 8) {
                    for (int increment = 1; increment < queenPositions.length; increment++) {
                        if ((currentXValue + 1) == checkingXValue && (currentYValue + 1) == checkingYValue) {
                            System.out.println(currentXValue + " and " + checkingXValue + " are conflicting with " + currentYValue + " and " + checkingYValue);
                            return false;
                        }
                    }
                    for (int increment = 1; increment < queenPositions.length; increment++) {
                        if ((currentXValue - increment) == checkingXValue && (currentYValue - increment) == checkingYValue) {
                            System.out.println(currentXValue + " and " + checkingXValue + " are conflicting with " + currentYValue + " and " + checkingYValue);
                            return false;
                        }
                    }
                    for (int increment = 1; increment < queenPositions.length; increment++) {
                        if ((currentXValue + increment) == checkingXValue && (currentYValue - increment) == checkingYValue) {
                            System.out.println(currentXValue + " and " + checkingXValue + " are conflicting with " + currentYValue + " and " + checkingYValue);
                            return false;
                        }
                    }
                    for (int increment = 1; increment < queenPositions.length; increment++) {
                        if ((currentXValue - increment) == checkingXValue && (currentYValue + increment) == checkingYValue) {
                            System.out.println(currentXValue + " and " + checkingXValue + " are conflicting with " + currentYValue + " and " + checkingYValue);
                            return false;

                        }
                    }
                }
            }
        }
        return noConflict;
    }


    public static String readInputString(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        return reader.readLine();
    }
}