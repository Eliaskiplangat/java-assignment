public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message); // pass the message up to the built-in Exception class
    }
}