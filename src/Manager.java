public class Manager extends Employee {

    private double managementAllowance;

    public Manager(String name, double baseSalary, String department,
                   double bonus, double managementAllowance) {
        // ---- "super(...)" calls the parent class constructor ----
        super(name, baseSalary, department, bonus);
        this.managementAllowance = managementAllowance;
    }

    @Override
    public double calculatePayment() {
        // ---- "super.method()" calls the parent class's version of the method ----
        double baseAmount = super.calculatePayment();
        return baseAmount + managementAllowance;
    }
}
