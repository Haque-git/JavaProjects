package CSE111_Practice;

public class Student {

    String name;
    int id;

    public Student () {
        this.name = "Default";
        this.id = 0;
    }
    public Student (String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void study() {
        System.out.println("Studying");
    }
}