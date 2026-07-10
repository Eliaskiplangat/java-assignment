import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CollectionsDemo {

    public static void main(String[] args) {

        // ================= ArrayList =================
        // Ordered, allows duplicates, resizable list
        System.out.println("=== ArrayList ===");
        ArrayList<String> names = new ArrayList<>();
        names.add("Elias");
        names.add("Brian");
        names.add("Alice");
        names.add("Brian"); // duplicates allowed

        System.out.println("Names: " + names);
        System.out.println("Element at index 1: " + names.get(1));

        names.remove("Alice");
        System.out.println("After removing Alice: " + names);

        for (String name : names) {
            System.out.println("Name -> " + name);
        }
        System.out.println("Size: " + names.size());

        // ================= HashSet =================
        // Unordered, no duplicates allowed
        System.out.println("\n=== HashSet ===");
        HashSet<String> cities = new HashSet<>();
        cities.add("Nairobi");
        cities.add("Mombasa");
        cities.add("Kisumu");
        cities.add("Nairobi"); // duplicate, will be ignored

        System.out.println("Cities: " + cities);
        System.out.println("Contains 'Mombasa': " + cities.contains("Mombasa"));

        cities.remove("Kisumu");
        System.out.println("After removing Kisumu: " + cities);
        System.out.println("Set size: " + cities.size());

        // ================= HashMap =================
        // Stores data as key-value pairs, keys are unique
        System.out.println("\n=== HashMap ===");
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Elias", 85);
        studentScores.put("Brian", 72);
        studentScores.put("Alice", 90);

        System.out.println("Map: " + studentScores);
        System.out.println("Brian's score: " + studentScores.get("Brian"));

        studentScores.put("Brian", 78); // updates existing key
        System.out.println("Updated Brian's score: " + studentScores.get("Brian"));

        System.out.println("Contains key 'Alice': " + studentScores.containsKey("Alice"));

        System.out.println("\nIterating over HashMap entries:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }
    }
}