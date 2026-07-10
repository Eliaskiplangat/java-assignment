public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // ---- Method overriding: Rectangle's own version of calculateArea ----
    @Override
    public double calculateArea() {
        return width * height;
    }
}