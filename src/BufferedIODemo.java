import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIODemo {

    public static void main(String[] args) {

        String fileName = "buffereddata.txt";

        // ---- BufferedWriter: efficient text writing, line by line ----
        System.out.println("=== BufferedWriter (writing) ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Line 1: Learning Java I/O");
            writer.newLine(); // writes a line separator
            writer.write("Line 2: BufferedWriter is efficient for text");
            writer.newLine();
            writer.write("Line 3: Because it buffers output before writing");
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // ---- BufferedReader: efficient text reading, line by line ----
        System.out.println("\n=== BufferedReader (reading) ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}