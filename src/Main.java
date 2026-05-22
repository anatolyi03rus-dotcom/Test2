public class Main {

    static class Phone {
        String model;
        int memory;

        Phone(String model, int memory) {
            this.model = model;
            this.memory = memory;
        }

        void showInfo() {
            System.out.println(model + " " + memory + "GB");
        }
    }

    public static void main(String[] args) {

        Main.Phone phone1 =
                new Phone("Samsung", 128);

        Main.Phone phone2 =
                new Phone("iPhone", 256);

        Main.Phone phone3 =
                new Phone("Xiaomi", 64);

        phone1.showInfo();
        phone2.showInfo();
        phone3.showInfo();
    }
}