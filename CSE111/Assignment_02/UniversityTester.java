// Task_01

package CSE111.Assignment_02;

public class UniversityTester {
    public static void main(String[] args) {
        University uni_01 = new University();
        University uni_02 = new University();
        

        System.out.println(uni_01);
        System.out.println(uni_02);
        System.out.println(uni_01.name);
        System.out.println(uni_01.country);
        System.out.println(uni_02.name);
        System.out.println(uni_01.country);
        
        uni_01.name = "Imperial College London";
        uni_01.country = "England";
        
        uni_02.name = "BRAC University";
        uni_02.country = "BRAC University";
        
        System.out.println(uni_01.name);
        System.out.println(uni_01.country);
        System.out.println(uni_02.name);
        System.out.println(uni_01.country);

    }
}
