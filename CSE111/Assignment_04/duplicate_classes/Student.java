// Task: 01

package CSE111.Assignment_04.duplicate_classes;

public class Student {
    String name;
    String prog;
    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }
    public void updateName(String name) {
        this.name = name;
    }
    public void updateProgram(String prog) {
        this.prog = prog;
    }
    public String accessProgram() {
        return this.prog;
    }
}
