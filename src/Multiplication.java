public class Multiplication {
    public static void main(String [] arguments) {
        System.out.println("Hello World");
        int answer = multiply(5,5);
        System.out.println("The answer is " + answer);
        String[] names = new String[] {"John","Doe","Mark"};
        String combination = combineLoop(names);
        System.out.println("combination = " + combination);
    }

    public static int multiply(int value1, int value2) {
        int multiplicationValue = value1 * value2;
        return multiplicationValue;
    }

    public static String combine(String[] listOfNames) {
        String result = listOfNames[0] + " " + listOfNames[1];
        return result;
    }

    public static String combineLoop(String[] listOfNames) {
        String output = "";
        for(int i = 0; i < listOfNames.length; i = i + 1){
            System.out.println(i);
            output = output + listOfNames[i] + " ";

        }
        return output;
    }
}
