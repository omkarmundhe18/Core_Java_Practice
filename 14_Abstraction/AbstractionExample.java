abstract class Vehicle {

    abstract void start();
}

class Car extends Vehicle {

    int noTyers = 4;

    void start() {
        System.out.println("Car starts with key");
    }

    void displayTyer() {
        System.out.println("Car Tyers: " + noTyers);
    }
}

class Bike extends Vehicle {

    int noTyers = 2;

    void start() {
        System.out.println("Bike starts with self start");
    }

    void displayTyer() {
        System.out.println("Bike Tyers: " + noTyers);
    }
}

class AbstractionExample {

    public static void main(String[] args) {

        Car c = new Car();
        c.start();
        c.displayTyer();

        Bike b = new Bike();
        b.start();
        b.displayTyer();
    }
}