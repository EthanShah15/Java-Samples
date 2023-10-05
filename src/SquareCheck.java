import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SquareCheck {
    public static void main(String[] args) throws IOException {
        int number = readInputNumber("Please enter your number");
        if(doesGivenNumberEndWith(number,2)||doesGivenNumberEndWith(number,3)||doesGivenNumberEndWith(number,7)||doesGivenNumberEndWith(number,8)){
            System.out.println("This number is not a square because it ends with a bad number");
        }else {
            int squareRoot = checkSquare(number);
            if (squareRoot > 1) {
                System.out.println("This is a square number and the square root is: " + squareRoot);
            }else{
                System.out.println("This number is not a square");
            }
        }
    }

    public static int checkSquare(int number){
        int squareRoot = -1;
        for(int i = 0; i < number; i++){
            if(i*i == number){
                squareRoot = i;
            }
        }
        return squareRoot;
    }

    public static boolean doesGivenNumberEndWith(int givenNumber,int endWith){
        int remainder = givenNumber%10;
        if(remainder == endWith){
            return true;
        }
        return false;
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
