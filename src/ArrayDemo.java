import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {

        // Declaring and initializing an array
        int[] numbers = {10, 25, 3, 47, 8};

        System.out.println("=== Array Basics ===");
        System.out.println("Full array: " + Arrays.toString(numbers));
        System.out.println("Length: " + numbers.length);
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Modifying an element
        numbers[2] = 99;
        System.out.println("After update, index 2: " + numbers[2]);

        // Looping through an array
        System.out.println("\n=== Looping through array ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Enhanced for-each loop
        System.out.println("\n=== For-each loop ===");
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        System.out.println("Sum of array: " + sum);

        // Sorting an array
        Arrays.sort(numbers);
        System.out.println("\nSorted array: " + Arrays.toString(numbers));

        // 2D array example
        System.out.println("\n=== 2D Array ===");
        int[][] grid = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }

        // Array of Strings
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("\nFruits: " + Arrays.toString(fruits));
    }
}