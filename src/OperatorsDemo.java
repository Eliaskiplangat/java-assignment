public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 12;
        int b = 5;

        // ---- Arithmetic operators ----
        System.out.println("=== Arithmetic Operators ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));   // integer division
        System.out.println("a % b = " + (a % b));   // remainder

        int c = 5;
        c++;                 // increment
        System.out.println("c after c++ = " + c);
        c--;                 // decrement
        System.out.println("c after c-- = " + c);

        // ---- Relational (comparison) operators ----
        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // ---- Logical operators ----
        System.out.println("\n=== Logical Operators ===");
        boolean x = true;
        boolean y = false;

        System.out.println("x && y : " + (x && y)); // logical AND
        System.out.println("x || y : " + (x || y)); // logical OR
        System.out.println("!x     : " + (!x));      // logical NOT

        // A practical example combining relational + logical operators
        int age = 20;
        boolean hasId = true;
        if (age >= 18 && hasId) {
            System.out.println("\nEntry allowed: age >= 18 AND has ID");
        } else {
            System.out.println("\nEntry denied");
        }
    }
}
