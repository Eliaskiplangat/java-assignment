public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    // Abstract method: no body here, must be implemented by subclasses
    public abstract double calculateArea();

    // Concrete (regular) method shared by all subclasses
    public void displayInfo() {
        System.out.println(name + " area: " + calculateArea());
    }
}