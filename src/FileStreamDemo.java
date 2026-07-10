import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

    public static void main(String[] args) {

        String fileName = "streamdata.txt";

        // ---- FileOutputStream: writing raw bytes to a file ----
        System.out.println("=== FileOutputStream (writing) ===");
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            String content = "Hello from FileOutputStream!\nJava file handling is fun.";
            byte[] bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // ---- FileInputStream: reading raw bytes from a file ----
        System.out.println("\n=== FileInputStream (reading) ===");
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int data;
            StringBuilder sb = new StringBuilder();
            while ((data = fis.read()) != -1) {
                sb.append((char) data);
            }
            System.out.println("Contents read from file:");
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}