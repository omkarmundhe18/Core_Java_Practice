abstract class Vehicle {

    abstract void start();
}

class Bike extends Vehicle {

    int noTyers = 2;

    @Override
    void start() {
        System.out.println("Bike starts with self start");
    }

    void displayTyer() {
        System.out.println("Number of Tyers: " + noTyers);
    }

    public static void main(String[] args) {

        Bike b = new Bike();

        b.start();
        b.displayTyer();
    }
}