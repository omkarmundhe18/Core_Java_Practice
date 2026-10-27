class Bank {
    double balance = 1000.0;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Amount: " + amount);
    }

    void withdrawal(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Amount: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Total Balance: " + balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.deposit(500.50);
        b.withdrawal(200.25);
        b.display();
    }
}