// Task_08

package CSE111.Assignment_02;

public class Employee {
    public String name;
    public double salary = 30000;
    public String designation = "junior";

    public void newEmployee(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Designation: " + designation);
    }

    public void calculateTax(){
        if (salary <= 30000){ 
            System.out.println("No need to pay tax");
        } else if (salary > 30000 && salary < 50000) {
            System.out.println(this.name + " Tax Amount "+ salary*0.1 + " Tk");
        } else {
            System.out.println(this.name + " Tax Amount "+ salary*0.3 + " Tk");
        }
    }

    public void promoteEmployee(String designation){
        this.designation = designation;
        if (designation.equals("senior")){
            salary += 25000;
        } else if (designation.equals("lead")){
            salary += 50000;
        } else if (designation.equals("manager")){
            salary += 75000;
            
        }
        System.out.println(this.name + " promoted to " + designation);
        System.out.println("New Salary: " + salary + " Tk");
    }

}
