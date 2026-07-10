public class Manager extends Employee {

    private double managementAllowance;

    public Manager(String name, double baseSalary, String department,
                   double bonus, double managementAllowance) {
        super(name, baseSalary, department, bonus);
        this.managementAllowance = managementAllowance;
    }

    @Override
    public double calculatePayment() {
        double baseAmount = super.calculatePayment();
        return baseAmount + managementAllowance;
    }
}
