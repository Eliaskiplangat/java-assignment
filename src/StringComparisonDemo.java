public class StringComparisonDemo {

    public static void main(String[] args) {

        // ---- String: immutable, every modification creates a NEW object ----
        System.out.println("=== String (immutable) ===");
        String str = "Hello";
        String original = str;
        str = str + " World"; // this does NOT change the original object,
        // it creates a brand new String and reassigns str
        System.out.println("Modified str: " + str);
        System.out.println("Original reference unchanged: " + original);

        // ---- StringBuilder: mutable, NOT thread-safe, faster for single-threaded use ----
        System.out.println("\n=== StringBuilder (mutable, not synchronized) ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // modifies the SAME object in place, no new object created
        System.out.println("StringBuilder result: " + sb);

        // ---- StringBuffer: mutable, thread-safe (synchronized), slightly slower ----
        System.out.println("\n=== StringBuffer (mutable, synchronized/thread-safe) ===");
        StringBuffer sbuf = new StringBuffer("Hello");
        sbuf.append(" World");
        System.out.println("StringBuffer result: " + sbuf);

        // ---- Performance illustration: concatenating in a loop ----
        System.out.println("\n=== Why it matters: repeated concatenation ===");

        long start = System.nanoTime();
        String concatResult = "";
        for (int i = 0; i < 1000; i++) {
            concatResult += i; // creates a new String object on every iteration
        }
        long end = System.nanoTime();
        System.out.println("String concatenation time (ns): " + (end - start));

        start = System.nanoTime();
        StringBuilder builderResult = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            builderResult.append(i); // modifies the same buffer, no new objects
        }
        end = System.nanoTime();
        System.out.println("StringBuilder append time (ns): " + (end - start));

        System.out.println("\nSummary:");
        System.out.println("- String: immutable, use for fixed/rarely-changed text");
        System.out.println("- StringBuilder: mutable, fast, use in single-threaded code");
        System.out.println("- StringBuffer: mutable, thread-safe, use in multi-threaded code");
    }
}