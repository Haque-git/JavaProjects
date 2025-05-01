package CSE111.Assignment_08;

public class CheckingAccount extends Account {

    public static int count = 0;

    public CheckingAccount() {
        super(0.0);
        CheckingAccount.count++;
    }
    
    public CheckingAccount(double balance) {
        super(balance);
        CheckingAccount.count++;
    }
}
