public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Circle"); // calls Shape's constructor
        this.radius = radius;
    }

    // ---- Method overriding: providing Circle's own version of calculateArea ----
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}