public class StringBuilderPractice {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Original: " + sb);

        sb.append(" Programming");
        System.out.println("Append: " + sb);

        sb.insert(4, " and");
        System.out.println("Insert: " + sb);

        sb.replace(0, 4, "Python");
        System.out.println("Replace: " + sb);

        sb.delete(0, 7);
        System.out.println("Delete: " + sb);

        sb.deleteCharAt(0);
        System.out.println("DeleteCharAt: " + sb);

        System.out.println("CharAt(2): " + sb.charAt(2));

        System.out.println("Substring(0,5): " + sb.substring(0, 5));

        String result = sb.toString();

        System.out.println("ToString: " + result);
    }
}