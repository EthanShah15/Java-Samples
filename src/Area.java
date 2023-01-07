import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {

    public static void main(String[] args) throws Exception{
        int sideA = readInput("Please enter side A");
        int sideB = readInput("Please enter side B");
        int areaOutput = findArea(sideA,sideB);
        int perimeterOutput = findPerimeter(sideA,sideB);
        System.out.println("The area is: " + areaOutput + " The perimeter is: " + perimeterOutput);
    }

    public static int findArea(int a, int b){
        int area = (a*b);
        return area;
    }

    public static int findPerimeter(int a, int b){
        int perimeter = (a+a+b+b);
        return perimeter;
    }

    public static int readInput(String prompt) throws IOException {
        System.out.println(prompt);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();
        return Integer.parseInt(input);
    }
}
