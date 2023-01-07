public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myAnswer1 = addition (1, 2, 3, 4);
        int myAnswer2 = addition (5, 6, 7, 8);
        System.out.println("myAnswer = " + (myAnswer1 + myAnswer2));
        int [] bucket = new int[] {1, 2, 3, 4, 5};
        int myAnswer3 = addition(bucket);
        System.out.println("myAnswer3 = " + myAnswer3);
    }

    public static int addition(int value1, int value2, int value3, int value4){
        int answer = value1 + value2 + value3 + value4;
        return answer;
    }

    public static int addition(int [] values) {
        return 0;
    }
}