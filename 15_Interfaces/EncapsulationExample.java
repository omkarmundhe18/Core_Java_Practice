class BankAccount {
    private double balance = 1000.0;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit: " + amount);
        } else {
            System.out.println("Invalid Amount");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.deposit(500.0);
        b.displayBalance();
    }
}