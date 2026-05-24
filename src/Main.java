import java.util.ArrayList;

public class Main {
    // Умножить два многочлена заданной степени, если коэффициенты многоч-
    //ленов хранятся в различных списках
    public static void main(String[] args) {

        // 2x² + 3x + 1
        ArrayList<Integer> poly1 = new ArrayList<>();
        poly1.add(1);
        poly1.add(3);
        poly1.add(2);

        //  x + 4
        ArrayList<Integer> poly2 = new ArrayList<>();
        poly2.add(4);
        poly2.add(1);


        int[] result =
                new int[poly1.size() + poly2.size() - 1];


        for (int i = 0; i < poly1.size(); i++) {

            for (int j = 0; j < poly2.size(); j++) {

                result[i + j] +=
                        poly1.get(i) * poly2.get(j);
            }
        }


        System.out.println("Результат:");

        for (int i = result.length - 1; i >= 0; i--) {

            System.out.print(result[i] + "x^" + i);

            if (i != 0) {
                System.out.print(" + ");
            }
        }
    }
}