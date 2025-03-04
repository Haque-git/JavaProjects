// Task_05

package CSE111.Assignment_02;

public class Course {
    private String name;
    private String code;
    private int credit;
    
    public void updateDetails(String name, String code, int credit){
        this.name = name;
        this.code = code;
        this.credit = credit;
    }

    public void displayCourse(){
        System.out.println("Course Name: "+name);
        System.out.println("Course Code: "+code);
        System.out.println("Course Credit: "+credit);
    }

}
