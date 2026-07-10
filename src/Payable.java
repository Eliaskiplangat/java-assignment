public interface Payable {

    // Interface methods are implicitly public and abstract (no body)
    double calculatePayment();

    // Interfaces can also have default methods (with a body) since Java 8
    default void printPaymentInfo() {
        System.out.println("Payment amount: " + calculatePayment());
    }
}
