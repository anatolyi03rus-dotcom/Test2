//Testest

//Создать объект класса Щенок, используя классы Животное, Собака.
//Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
import java.util.Scanner;
class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("Имя: " + name);
    }
}

class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }

    public void voice() {
        System.out.println(name + " говорит: Гав-гав!");
    }

    public void run() {
        System.out.println(name + " бегает");
    }

    public void bite() {
        System.out.println(name + " кусается");
    }
}

class Puppy extends Dog {


    public Puppy(String name) {
        super(name);
    }

    public void jump() {
        System.out.println(name + " прыгает");
    }
}

public class Main {

    public static void main(String[] args) {

        Puppy puppy = new Puppy("Анатолий Б763");

        puppy.showName();
        puppy.voice();
        puppy.jump();
        puppy.run();
        puppy.bite();
    }
}