public class BankAccount {
    private String accountHolder;
    private double balance;
    public BankAccount() {
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

    // ---- Constructor 2: parameterized (constructor overloading) ----
    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // ---- Constructor 3: another overload ----
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // ---- Getters and setters (encapsulation: controlled access) ----
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // ---- Method overloading: same name "deposit", different parameters ----
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void deposit(double amount, String note) {
        deposit(amount);
        System.out.println("Note for deposit: " + note);
    }

    // ---- Method overloading: "withdraw" with different signatures ----
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
            return true;
        }
        System.out.println("Withdrawal failed: insufficient funds");
        return false;
    }

    public boolean withdraw(double amount, boolean allowOverdraft) {
        if (allowOverdraft) {
            balance -= amount;
            System.out.println("Withdrew with overdraft allowed: " + amount);
            return true;
        }
        return withdraw(amount);
    }

    public static void main(String[] args) {
        System.out.println("=== Constructor Overloading ===");
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Elias");
        BankAccount acc3 = new BankAccount("Brian", 1000.0);

        System.out.println(acc1.getAccountHolder() + " balance: " + acc1.getBalance());
        System.out.println(acc2.getAccountHolder() + " balance: " + acc2.getBalance());
        System.out.println(acc3.getAccountHolder() + " balance: " + acc3.getBalance());

        System.out.println("\n=== Method Overloading (deposit/withdraw) ===");
        acc3.deposit(500);
        acc3.deposit(200, "Salary top-up");
        acc3.withdraw(300);
        acc3.withdraw(5000, true); // allows overdraft

        System.out.println("\nFinal balance for " + acc3.getAccountHolder()
                + ": " + acc3.getBalance());
    }
}