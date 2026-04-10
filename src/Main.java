//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//import java.util.Scanner;
//Ввести пароль из командной строки и сравнить его со строкой-образцом.
//public class Main {
 //   public static void main(String[] args) {
       // String samplePassword = "пароль999";

    //    Scanner scanner = new Scanner(System.in);

     //   System.out.print("Введите пароль: ");
     //   String inputPassword = scanner.nextLine();
//
    //    if (inputPassword.equals(samplePassword)) {
   //         System.out.println("Пароль верный");
   //     } else {
   //         System.out.println("Пароль неверный");
   //     }
 //   }
//


public class Main {
    //Найти корни квадратного уравнения. Параметры уравнения передавать с командной строкой
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Использование: java Main a b c");
            return;
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            System.out.println("Это не квадратное уравнение (a = 0)");
            return;
        }

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("Два корня:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);

        } else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корень:");
            System.out.println("x = " + x);

        } else {
            System.out.println("Корней нет (D < 0)");
        }
    }
}