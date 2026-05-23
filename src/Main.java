interface Building {

    void build();                  // построить
    double pricePerSquare();       // цена за метр квадра
    int roomCount();               // количество комнат
    void increaseArea(double area);// увеличить площадь
    void rent();                   // сдать в аренду
    void repair(String room);      // ремонт комнаты
}


class House implements Building {

    double area;
    int rooms;

    House(double area, int rooms) {
        this.area = area;
        this.rooms = rooms;
    }

    public void build() {
        System.out.println("Дом построен");
    }

    public double pricePerSquare() {
        return 1200;
    }

    public int roomCount() {
        return rooms;
    }

    public void increaseArea(double area) {
        this.area += area;
        System.out.println("Площадь увеличена");
    }

    public void rent() {
        System.out.println("Дом сдан в аренду");
    }

    public void repair(String room) {
        System.out.println("Ремонт в комнате: " + room);
    }


    void garden() {
        System.out.println("Во дворе есть сад");
    }
}


class OfficeBuilding implements Building {

    public void build() {
        System.out.println("Офис построен");
    }

    public double pricePerSquare() {
        return 2000;
    }

    public int roomCount() {
        return 50;
    }

    public void increaseArea(double area) {
        System.out.println("Офис расширен на " + area);
    }

    public void rent() {
        System.out.println("Офис сдан");
    }

    public void repair(String room) {
        System.out.println("Ремонт офиса: " + room);
    }


    void conferenceRoom() {
        System.out.println("Есть конференц-зал");
    }
}



class ShoppingCenter implements Building {

    public void build() {
        System.out.println("Торговый центр построен");
    }

    public double pricePerSquare() {
        return 3000;
    }

    public int roomCount() {
        return 100;
    }

    public void increaseArea(double area) {
        System.out.println("ТЦ увеличен на " + area);
    }

    public void rent() {
        System.out.println("ТЦ сдан в аренду");
    }

    public void repair(String room) {
        System.out.println("Ремонт магазина: " + room);
    }

    void parking() {
        System.out.println("Есть парковка");
    }
}

public class Main {

    public static void main(String[] args) {

        House house = new House(120, 5);

        house.build();
        System.out.println("Цена за м квадтратный: " + house.pricePerSquare());
        System.out.println("Комнат: " + house.roomCount());

        house.increaseArea(20);
        house.rent();
        house.repair("Кухня");

        house.garden();

        System.out.println();

        OfficeBuilding office = new OfficeBuilding();
        office.conferenceRoom();

        ShoppingCenter mall = new ShoppingCenter();
        mall.parking();
    }
}