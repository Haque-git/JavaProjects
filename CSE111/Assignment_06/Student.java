// task: 6.7

package CSE111.Assignment_06;

public class Student {
    public static int total_students = 0;
    public static int cse_students = 0;
    public static int other_students = 0;

    private String name;
    private int id;
    private double cgpa;
    private String department;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
        Student.total_students++;
        this.department = "CSE";
        this.id = Student.total_students;
        Student.cse_students++;
    }
    public Student(String name, double cgpa, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
        Student.total_students++;
        this.id = Student.total_students;
        if (department.equalsIgnoreCase("CSE")) {
            Student.cse_students++;
        } else {
            Student.other_students++;
        }
    }

    public static void printDetails() {
        System.out.println("Total Student(s): " + Student.total_students);
        System.out.println("CSE Student(s): " + Student.cse_students);
        System.out.println("Other Department Student(s): " + Student.other_students);
    }

    public void individualDetail() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("CGPA: " + this.cgpa);
        System.out.println("Department: " + this.department);
    }

}
