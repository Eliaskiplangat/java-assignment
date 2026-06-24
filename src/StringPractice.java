public class StringPractice {

    public static void main(String[] args) {

        String name = "Elias Kiplangat";

        System.out.println("Original: " + name);

        System.out.println("Length: " + name.length());

        System.out.println("Uppercase: " + name.toUpperCase());

        System.out.println("Lowercase: " + name.toLowerCase());

        System.out.println("First Character: " + name.charAt(0));

        System.out.println("Last Character: "
                + name.charAt(name.length() - 1));

        System.out.println("Index of K: "
                + name.indexOf('K'));

        System.out.println("Surname: "
                + name.substring(6));

        System.out.println("Trimmed: "
                + "   Java   ".trim());

        System.out.println("Concat: "
                + name.concat(" - Developer"));
    }
}