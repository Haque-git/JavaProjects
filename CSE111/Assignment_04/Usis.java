package CSE111.Assignment_04;

public class Usis {
    private int capacity = 5;
    int totalAdvises = 0;
    int index = 0;
    Student[] students = new Student[capacity];

    public void login(Student student) {
        if (student.email == null || student.password == null) {
            System.out.println("Email and password need to be set.");
            return;
        }

        student.isLoggedIn = true;
        System.out.println("Login successful!");
    }

    public void advising(Student student) {
        if (!student.isLoggedIn) {
            System.out.println("Please login to advise courses!");
            return;
        }
        System.out.println("You haven't selected any courses.");
    }

    public void advising(Student student, String course1, String course2, String course3) {
        if (!student.isLoggedIn) {
            System.out.println("Please login to advise courses!");
            return;
        }

        student.courses[0] = course1;
        student.courses[1] = course2;
        student.courses[2] = course3;
        student.index = 3;
        this.students[index] = student;
        index++;
        totalAdvises++;
        System.out.println("Advising successful!");
    }

    public void advising(Student student, String course1, String course2, String course3, String course4) {
        if (!student.isLoggedIn) {
            System.out.println("Please login to advise courses!");
            return;
        }

        if (!student.hasSpaciaPermit) {
            System.out.println("You need special approval to take more than 3 courses.");
            return;
        }
        student.courses[0] = course1;
        student.courses[1] = course2;
        student.courses[2] = course3;
        student.courses[3] = course4;
        student.index = 4;
        this.students[index] = student;
        index++;
        totalAdvises++;
        System.out.println("Advising successful!");
    }

    public void allAdviseeInfo() {
        System.out.printf("Total students %d\n", totalAdvises);
        for (int i = 0; i < totalAdvises; i++) {
            Student current_student = students[i];
            System.out.printf("Name: %s ID: %d Department: %s\n", current_student.name, current_student.ID, current_student.dep);
            System.out.println("Advised Courses:");
            for (int j = 0; j < current_student.index; j++) {
                System.out.print(current_student.courses[j]+ " ");
            }
            System.out.println();
        }
    }

}
