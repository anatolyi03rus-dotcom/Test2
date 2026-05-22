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


import java.util.Scanner;
// Train: Пункт назначения, Номер поезда, Время отправления, Число мест
//(общих, купе, плацкарт, люкс).
//Создать массив объектов. Вывести:
//a) список поездов, следующих до заданного пункта назначения;
//b) список поездов, следующих до заданного пункта назначения и отправ-
//ляющихся после заданного часа;
//c) список поездов, отправляю

class Train {
    String destination; // пункт назначения
    int trainNumber;    // номер поезда
    int departureTime;  // время отправления
    int commonSeats;    // общие места
    int coupeSeats;     // купе
    int platzkartSeats; // плацкарт
    int luxSeats;       // люкс


    public Train(String destination, int trainNumber, int departureTime,
                 int commonSeats, int coupeSeats,
                 int platzkartSeats, int luxSeats) {

        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
        this.commonSeats = commonSeats;
        this.coupeSeats = coupeSeats;
        this.platzkartSeats = platzkartSeats;
        this.luxSeats = luxSeats;
    }


    public void showInfo() {
        System.out.println(
                "Пункт назначения: " + destination +
                        ", Номер поезда: " + trainNumber +
                        ", Время отправления: " + departureTime +
                        ", Общих мест: " + commonSeats +
                        ", Купе: " + coupeSeats +
                        ", Плацкарт: " + platzkartSeats +
                        ", Люкс: " + luxSeats
        );
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Train[] trains = {
                new Train("Улан-Удэ", 101, 10, 50, 20, 30, 10),
                new Train("Минск", 202, 15, 0, 25, 40, 5),
                new Train("Москва", 303, 18, 15, 10, 20, 2),
                new Train("Киев", 404, 9, 60, 15, 25, 8)
        };


        System.out.print("Введите пункт назначения: ");
        String destination = scanner.nextLine();

        System.out.println("\nПоезда до " + destination + ":");

        for (Train train : trains) {
            if (train.destination.equalsIgnoreCase(destination)) {
                train.showInfo();
            }
        }


        System.out.print("\nВведите час отправления: ");
        int hour = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nПоезда до " + destination +
                ", отправляющиеся после " + hour + ":");

        for (Train train : trains) {
            if (train.destination.equalsIgnoreCase(destination)
                    && train.departureTime > hour) {

                train.showInfo();
            }
        }


        System.out.println("\nПоезда до " + destination +
                " с общими местами:");

        for (Train train : trains) {
            if (train.destination.equalsIgnoreCase(destination)
                    && train.commonSeats > 0) {

                train.showInfo();
            }
        }
    }
}