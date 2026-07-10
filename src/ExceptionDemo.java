public class ExceptionDemo {

    // A method that throws our custom checked exception
    public static void withdraw(double balance, double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Cannot withdraw " + amount + ", balance is only " + balance);
        }
        System.out.println("Withdrawal successful. New balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        // ---- Basic try-catch ----
        System.out.println("=== Basic try-catch ===");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught error: " + e.getMessage());
        }

        // ---- try-catch with multiple catch blocks ----
        System.out.println("\n=== Multiple catch blocks ===");
        try {
            int result = 10 / 0; // throws ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General error: " + e.getMessage());
        }

        // ---- try-catch-finally ----
        System.out.println("\n=== try-catch-finally ===");
        try {
            String text = null;
            System.out.println(text.length()); // throws NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            // finally block always runs, whether an exception occurred or not
            System.out.println("Finally block executed (cleanup happens here)");
        }

        // ---- Custom exception handling ----
        System.out.println("\n=== Custom Exception (InsufficientFundsException) ===");
        try {
            withdraw(500.0, 800.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt finished.");
        }

        // A successful case that does not throw
        try {
            withdraw(500.0, 200.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }

        System.out.println("\nProgram continues normally after handled exceptions.");
    }
}