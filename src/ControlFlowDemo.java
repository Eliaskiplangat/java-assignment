public class ControlFlowDemo {
    public static void main(String[] args) {

        // ---- if-else ----
        System.out.println("=== if-else ===");
        int score = 72;
        if (score >= 80) {
            System.out.println("Grade: A");
        } else if (score >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        // ---- switch statement ----
        System.out.println("\n=== switch ===");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Some other day");
                break;
        }

        // ---- for loop ----
        System.out.println("\n=== for loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop count: " + i);
        }

        // ---- while loop ----
        System.out.println("\n=== while loop ===");
        int count = 1;
        while (count <= 5) {
            System.out.println("while loop count: " + count);
            count++;
        }

        // ---- break statement ----
        System.out.println("\n=== break ===");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // exits the loop completely once i == 6
            }
            System.out.println("break demo i = " + i);
        }

        // ---- continue statement ----
        System.out.println("\n=== continue ===");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 == 0) {
                continue; // skips even numbers, moves to next iteration
            }
            System.out.println("continue demo (odd) i = " + i);
        }
    }
}
