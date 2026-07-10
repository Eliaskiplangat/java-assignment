public interface Payable {

    double calculatePayment();

    default void printPaymentInfo() {
        System.out.println("Payment amount: " + calculatePayment());
    }
}
