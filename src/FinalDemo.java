public class FinalDemo {

    // ---- final variable (constant): value cannot change once assigned ----
    static final double TAX_RATE = 0.16;

    // ---- final method: cannot be overridden by subclasses ----
    final void showPolicy() {
        System.out.println("This pricing policy cannot be changed by subclasses.");
    }

    public static void main(String[] args) {
        System.out.println("=== final variable ===");
        System.out.println("Tax rate: " + TAX_RATE);

        double price = 1000.0;
        double totalPrice = price + (price * TAX_RATE);
        System.out.println("Total price with tax: " + totalPrice);

        // TAX_RATE = 0.20; // Uncommenting this line would cause a compile error,
        //                     because final variables cannot be reassigned.

        final int localConstant = 5;
        System.out.println("\n=== final local variable ===");
        System.out.println("localConstant: " + localConstant);
        // localConstant = 10; // Also a compile error, once assigned it's locked.

        System.out.println("\n=== final method ===");
        FinalDemo demo = new FinalDemo();
        demo.showPolicy();
    }
}

// ---- final class: cannot be extended/subclassed at all ----
final class ImmutableConfig {
    static final String APP_NAME = "JavaPractice";
}

// The following would cause a compile error if uncommented,
// because ImmutableConfig is declared final and cannot be extended:
// class ExtendedConfig extends ImmutableConfig { }