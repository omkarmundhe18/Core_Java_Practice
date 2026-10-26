import java.util.Scanner;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using UPI: Rs. " + amount);
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using Credit Card: Rs. " + amount);
    }
}

class NetBanking implements Payment {
    public void pay(double amount) {
        System.out.println("Payment using Net Banking: Rs. " + amount);
    }
}

class PaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Select Payment Method: ");
        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        Payment p = null;

        switch (choice) {
            case 1:
                p = new UPI();
                break;
            case 2:
                p = new CreditCard();
                break;
            case 3:
                p = new NetBanking();
                break;
            default:
                System.out.println("Invalid Payment Method");
        }

        if (p != null) {
            p.pay(amount);
        }

        sc.close();
    }
}
