package CSE111.Assignment_08;

public class Manager extends Employee {
    
    private double bonus;
    
    public Manager(String name, double baseSalary, int hoursWorked, double bonus) {
        super(name, baseSalary, hoursWorked);
        this.bonus = bonus;
    }

    public void requestIncrement(int amount) {
        if (super.getHoursWorked() >= 100) {
            super.setBaseSalary(super.getBaseSalary() + amount);
            System.out.println(amount + "$ increment is approved.");
            return;
        }
        if (super.getHoursWorked() >= 80) {
            super.setBaseSalary(super.getBaseSalary() + (amount/2));
            System.out.println(amount/2 + "$ increment is approved.");
            return;
        }
        System.out.println("Increment denied.");
    }

    public double calculateSalary() {
        return super.getBaseSalary() + super.getBaseSalary()*(this.bonus/100.0);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus " + this.bonus + "%");
        System.out.println("Final Salary: $" + this.calculateSalary());
    }



}
