public class Math {

    public static void main(String[] args) {
        int output = equation(1,2);
        System.out.println("The answer is " + output);
    }

    public static int equation(int a, int b){
        int solution = (a*a + b*b + 2*a*b);
        return solution;
    }
}
