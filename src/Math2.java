import java.lang.Math;
public class Math2 {

    public static void main(String[] args) {
        double output = calculateHypotenuse(3, 4);
        System.out.println("The hypotenuse is " + output);
    }

    public static double calculateHypotenuse(int a, int b){
        double hypotenuse = Math.sqrt(a*a + b*b);
        return hypotenuse;
    }
}
