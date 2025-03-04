// Task_07

package CSE111.Assignment_02;

public class CellPhone {
    private int maxContacts = 3;
    String model;
    String[] contacts = new String[maxContacts];
    int i = 0;
    
    public void storeContact(String contact) {
        if(i<maxContacts){
            contacts[i] = contact;
            i++;
        }else{
            System.out.println("Memory full. New contact can't be stored.");
        }
    }
    
    public void printDetails() {
        System.out.println("Model: "+model);
        System.out.println("Contacts Stored: " + i);
        if (i > 0) {
            System.out.println("Stored Contacts:");
            for(int j = 0; j<i; j++) {
                System.out.println(contacts[j]);
            }
        }
    }
}
