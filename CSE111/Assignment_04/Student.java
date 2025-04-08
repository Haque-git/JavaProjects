// Task: 08

package CSE111.Assignment_04;

public class Student {
    String name;
    String dep;
    int ID;
    String email;
    String password;
    boolean isLoggedIn = false;
    boolean hasSpaciaPermit = false;
    String[] courses = new String[4];
    int index = 0;

    public Student(String name, int ID, String dep) {
        this.name = name;
        this.ID = ID;
        this.dep = dep;
        System.out.println("Student object is created");
    }
}
