class BankAccount {
    String accountHolderName;
    double balance;

    void displayAccount() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.println("Interest Earned: " + interest);
        System.out.println("New Balance: " + balance);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    double cashbackRate;

    void applyCashback() {
        double cashback = balance * cashbackRate / 100;
        balance += cashback;

        System.out.println("Cashback: " + cashback);
        System.out.println("New Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        PremiumSavingsAccount obj = new PremiumSavingsAccount();

        obj.accountHolderName = "Om";
        obj.balance = 10000;
        obj.interestRate = 5;
        obj.cashbackRate = 2;

        obj.displayAccount();
        obj.applyInterest();
        obj.applyCashback();
    }
}