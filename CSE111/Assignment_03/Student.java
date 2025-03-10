// Task_04

package CSE111.Assignment_03;

public class Student {
    public String name = "Not Set";
    public String department = "CSE";
    double cgpa = 0.0;
    int credits = 9;
    String scholarship_status = "Not Set";

    public void updateDetails(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public void updateDetails(String name, double cgpa, int credits) {
        this.updateDetails(name, cgpa);
        this.credits = credits;
    }

    public void updateDetails(String name, double cgpa, int credits, String department) {
        this.updateDetails(name, cgpa, credits);
        this.department = department;
    }

    public void showDetails() {
        System.out.println("Name: " + this.name + "\nDepartment: " + this.department + "\nCGPA: " + this.cgpa + "\nCredits: " + this.credits + "\nScholarship Status: " + this.scholarship_status);
    }

    public void calculateScholarshipEligibility() {
        if (cgpa >= 3.5 && credits >= 10) {
            if (cgpa >= 3.7) {
                scholarship_status = "Merit based scholarship";
            } else {
                scholarship_status = "Need-based scholarship";
            }
            return;
        }
        scholarship_status = "No scholarship";
    }

    public void checkScholarshipEligibility() {
        calculateScholarshipEligibility();
        if (scholarship_status.equals("Not Set")) {
            System.out.println(this.name + " is not eligible for scholarship");
        } else {
            System.out.println(this.name + " is eligible for " + scholarship_status);
        }
    }
}
