// Task: 04

package CSE111.Assignment_04.duplicate_classes.more_duplicate_classes;

public class Student {
    int studentID;
    double CGPA;
    private int capacity;
    String[] courses;
    private int index = 0;

    public Student(int studentID) {
        this.studentID = studentID;
        System.out.printf("A Student has been created with ID: %d\n", studentID);
    }

    public Student(int studentID, double CGPA) {
        this.studentID = studentID;
        storeCG(CGPA);
        System.out.printf("A Student has been created with ID: %d and CGPA: %.2f\n", studentID, CGPA);
    }

    int addCourse(String course) {
        if (CGPA==0) {
            System.out.printf("Failed to add %s\nset CG first\n", course);
            return 0;
        }
        if (index < capacity) {
            courses[index] = course;
            index++;
        } else {
            if (capacity == 3) {
                System.out.printf("Failed to add %s\n", course);
                System.out.println("CG is low. Can't add more than 3 courses.");
            } else {
                System.out.printf("Failed to add %s\n", course);
                System.out.println("Maximum 4 courses allowed.");
            }
            return -1;
        }
        return 0;
    }

    void addCourse(String[] courses) {
        for (String course : courses) {
            int result = this.addCourse(course);
            if (result == -1) {
                break;
            }
        }
    }

    void storeID(int studentID) {
        this.studentID = studentID;
    }

    void storeCG(double CGPA) {
        this.CGPA = CGPA;
        if (CGPA <= 3) {
            capacity = 3;
            courses = new String[capacity];
        } else {
            capacity = 4;
            courses = new String[capacity];
        }
    }

    void showAdvisee() {
        System.out.printf("Student ID: %d, ", studentID);
        System.out.printf("CGPA: %.2f\n", CGPA);
        if (index == 0) {
            System.out.println("No courses added.");
            return;
        }
        System.out.println("Added courses are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(courses[i] + " ");
        }
        System.out.println();
    }

    void removeAllCourse() {
        for (String course : this.courses) {
            course = null;
        }
        index = 0;
        System.out.println("All courses have been removed.");
    }




}
