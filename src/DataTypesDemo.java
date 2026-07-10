public class DataTypesDemo {

    public static void main(String[] args) {

        // ---- Primitive data types ----
        System.out.println("=== Primitive Data Types ===");
        byte b = 10;
        short s = 200;
        int i = 100000;
        long l = 10000000000L;      // note the L suffix for long literals
        float f = 5.75f;            // note the f suffix for float literals
        double d = 19.99;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // ---- Implicit casting (widening): smaller type -> larger type, automatic ----
        System.out.println("\n=== Implicit Casting (Widening) ===");
        int myInt = 9;
        double myDouble = myInt; // int automatically becomes double
        System.out.println("int " + myInt + " widened to double " + myDouble);

        // ---- Explicit casting (narrowing): larger type -> smaller type, must cast manually ----
        System.out.println("\n=== Explicit Casting (Narrowing) ===");
        double price = 19.99;
        int wholePrice = (int) price; // decimal part is truncated, not rounded
        System.out.println("double " + price + " narrowed to int " + wholePrice);

        long bigNumber = 123456789L;
        int smallerNumber = (int) bigNumber;
        System.out.println("long " + bigNumber + " narrowed to int " + smallerNumber);

        // ---- Wrapper classes: object versions of primitive types ----
        System.out.println("\n=== Wrapper Classes ===");
        Integer wrappedInt = 42;          // autoboxing: primitive -> wrapper
        int unwrappedInt = wrappedInt;    // unboxing: wrapper -> primitive
        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unwrapped back to int: " + unwrappedInt);

        Double wrappedDouble = Double.valueOf(3.14);
        System.out.println("Wrapper Double.valueOf: " + wrappedDouble);
        System.out.println("Parsing String to int: " + Integer.parseInt("250"));
        System.out.println("Parsing String to double: " + Double.parseDouble("12.5"));
    }
}