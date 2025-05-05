package CSE111.Assignment_08;

public class Developer extends Employee {

    private double bonus = 700;
    
    private String languageUses;

    public Developer(String name, double baseSalary, int hoursWorked, String languageUses) {
        super(name, baseSalary, hoursWorked);
        this.languageUses = languageUses;
    }

    public double calculateSalary() {
        return this.languageUses.equalsIgnoreCase("Java") ? super.getBaseSalary() + this.bonus : super.getBaseSalary();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Language: " + this.languageUses);
        System.out.println("Final Salary: $" + this.calculateSalary());
    }
}
