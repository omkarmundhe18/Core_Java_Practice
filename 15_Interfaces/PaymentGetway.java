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

        Payment p;

        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1000);

        p = new NetBanking();
        p.pay(1500);
    }
}
