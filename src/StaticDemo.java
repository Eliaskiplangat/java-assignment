public class StaticDemo {

    // ---- Static variable: shared across ALL instances of the class ----
    static int totalAccountsCreated = 0;

    // ---- Static block: runs once, when the class is first loaded ----
    static {
        System.out.println("Static block executed: StaticDemo class loaded.");
    }

    int accountId; // instance variable: unique to each object

    public StaticDemo() {
        totalAccountsCreated++;             // shared counter increments for every object
        this.accountId = totalAccountsCreated;
    }

    // ---- Static method: belongs to the class, not to any single object ----
    static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccountsCreated);
    }

    void showAccountId() {
        System.out.println("This account's ID: " + accountId);
    }

    public static void main(String[] args) {
        System.out.println("=== Static Members Demo ===");

        StaticDemo acc1 = new StaticDemo();
        StaticDemo acc2 = new StaticDemo();
        StaticDemo acc3 = new StaticDemo();

        acc1.showAccountId();
        acc2.showAccountId();
        acc3.showAccountId();

        // Static method/variable can be called using the class name directly
        StaticDemo.showTotalAccounts();

        // Also accessible (though not best practice) via an instance
        System.out.println("Accessed via instance: " + acc1.totalAccountsCreated);
    }
}