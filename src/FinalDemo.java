public class FinalDemo {

    static final double TAX_RATE = 0.16;
    final void showPolicy() {
        System.out.println("This pricing policy cannot be changed by subclasses.");
    }
    public static void main(String[] args) {
        System.out.println("=== final variable ===");
        System.out.println("Tax rate: " + TAX_RATE);

        double price = 1000.0;
        double totalPrice = price + (price * TAX_RATE);
        System.out.println("Total price with tax: " + totalPrice);
        final int localConstant = 5;
        System.out.println("\n=== final local variable ===");
        System.out.println("localConstant: " + localConstant);
        // localConstant = 10; // Also a compile error, once assigned it's locked.

        System.out.println("\n=== final method ===");
        FinalDemo demo = new FinalDemo();
        demo.showPolicy();
    }
}

final class ImmutableConfig {
    static final String APP_NAME = "JavaPractice";
}
