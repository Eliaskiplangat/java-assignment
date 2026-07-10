public class InterfaceDemo {

    public static void main(String[] args) {

        System.out.println("=== Interface (Payable) + this/super + Access Modifiers ===");

        Employee emp = new Employee("Alice", 50000, "Sales", 2000);
        Manager mgr = new Manager("Brian", 70000, "Operations", 3000, 5000);

        System.out.println(emp.getName() + "'s payment:");
        emp.printPaymentInfo(); // default method from the Payable interface

        System.out.println("\n" + mgr.getName() + "'s payment (includes management allowance):");
        mgr.printPaymentInfo();

        // Accessing public field directly (allowed anywhere)
        System.out.println("\nDepartment (public field): " + emp.department);

        // A Payable reference can point to any implementing class (polymorphism via interface)
        Payable[] payables = { emp, mgr };
        System.out.println("\n=== Looping over Payable references ===");
        for (Payable p : payables) {
            p.printPaymentInfo();
        }
    }
}