package java_roadmap.week2;


public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        if (balance < 0) {
            balance = 0.0;
        }
        this.balance = balance;
    }

    public BankAccount(BankAccount other) {
        this.accountNumber = other.accountNumber;
        this.holderName = other.holderName;
        this.balance = other.balance;
    }

    public boolean deposit(double Amount) {
        if (Amount > 0) {
            balance  += Amount;
            return true;
        }

        return false;
    }

    public boolean withdraw(double Amount) {
        if (0 < Amount && Amount <= balance) {
            balance -= Amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }


    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("101", "Sahil", 50000.4);
        System.out.println("Current Balance:  " + bankAccount.getBalance());
        System.out.println("Deposit:  " + bankAccount.deposit(50000.4));
        System.out.println("Balance:          " + bankAccount.getBalance());
    }
}
