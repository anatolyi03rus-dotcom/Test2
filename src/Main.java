interface MaxNumber {
    int findMax(int a, int b, int c);
}
//Дано три разных целых числа. Реализовать лямбда-выражение, которое на-
//ходит наибольшее из этих трех чисел.
public class Main {

    public static void main(String[] args) {


        MaxNumber max = (a, b, c) -> {

            int maxNum = a;

            if (b > maxNum) {
                maxNum = b;
            }

            if (c > maxNum) {
                maxNum = c;
            }

            return maxNum;
        };

        int result = max.findMax(10, 25, 7);

        System.out.println("Наибольшее число: " + result);
    }
}