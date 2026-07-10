import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Scanner: Reading User Input ===");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.println("\n--- Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");

        String category = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Category: " + category);

        scanner.close();
    }
}
