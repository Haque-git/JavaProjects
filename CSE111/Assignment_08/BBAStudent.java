package CSE111.Assignment_08;

public class BBAStudent extends Student {

    private void updateDep() {
        super.setDepartment("BBA");
    }
    
    public BBAStudent() {
        super.setName("Default");
        this.updateDep();
    }
    
    public BBAStudent(String name) {
        super.setName(name);
        this.updateDep();
    }
}
