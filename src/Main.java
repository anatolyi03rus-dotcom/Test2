//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
//Ввести пароль из командной строки и сравнить его со строкой-образцом.
public class Main {
    public static void main(String[] args) {
        String samplePassword = "пароль999";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(samplePassword)) {
            System.out.println("Пароль верный");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}

