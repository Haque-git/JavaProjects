package CSE111.Assignment_07;

public class Tennis_Tournament extends Tournament {
    
    private int numberOfPlayer;

    public Tennis_Tournament(String name, int numberOfPlayer) {
        super(name);
        this.numberOfPlayer = numberOfPlayer;
    }

    public String detail() {

        return "Tennis Tournament Name: " + super.getName() + "\nNumber of Players: " + this.numberOfPlayer;
    }
}
