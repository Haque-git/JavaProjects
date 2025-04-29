package CSE111.Assignment_07;

public class Cricket_Tournament extends Tournament {
    
    private int noOfTeam;
    private String type;
    
    public Cricket_Tournament() {
        super();
        this.noOfTeam = 0;
        this.type = "No Type";
    }

    public Cricket_Tournament(String name, int noOfTeam, String type) {
        super(name);
        this.noOfTeam = noOfTeam;
        this.type = type;
    }

    public String detail() {

        return "Cricket Tournamnet Name: " + super.getName() + "\nNumber of Teams: " + this.noOfTeam + "\nType: " + this.type;
    }    
}
