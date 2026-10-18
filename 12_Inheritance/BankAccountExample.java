class BankAccount {
    String accountHolder = "Om";
    double balance = 10000;

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    void displayType() {
        System.out.println("Account Type: Savings Account");
    }

    void displayInterest() {
        System.out.println("Interest Rate: 4.5%");
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();

        sa.displayAccount();
        sa.displayType();
        sa.displayInterest();
    }
}