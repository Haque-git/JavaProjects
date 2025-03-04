// Task_01

package CSE111.Assignment_03;

public class BankAccount {
    public int accountNumber = 0;
    public String accountType = "Not Set";
    
    public void setInfo(int accountNumber, String accountType){
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        System.out.println("Account information updated!");
    }
    
    public String printDetails(){
        return "Account No: " + this.accountNumber + "\nType: " + this.accountType;
    }
}
