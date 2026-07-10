public class Employee {
    private final String name;
    protected double baseSalary;
    public String department;
    double bonus;
    public Employee(String name, double baseSalary, String department, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.department = department;
        this.bonus = bonus;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public double calculatePayment() {
        return baseSalary + bonus;
    }
}
