public class ShapeDemo {

    public static void main(String[] args) {

        // ---- Polymorphism: a Shape reference can point to any subclass object,
        //      and the correct overridden method runs automatically at runtime ----
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(2.5);

        System.out.println("=== Polymorphism: looping over Shape references ===");
        for (Shape s : shapes) {
            // Even though the array type is Shape, calculateArea() runs the
            // Circle or Rectangle version depending on the actual object.
            s.displayInfo();
        }
    }
}