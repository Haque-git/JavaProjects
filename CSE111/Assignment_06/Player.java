package CSE111.Assignment_06;

public class Player {
    private static final int MAX_PLAYERS = 11;
    private static final Player[] players = new Player[MAX_PLAYERS];
    public static int total = 0;

    private String name;
    private String country;
    private int jerseyNumber;

    public Player(String name, String country, int jerseyNumber) {
        if (total >= MAX_PLAYERS) {
            throw new IllegalStateException("Cannot add more players. Maximum limit reached.");
        }

        
        this.name = name;
        this.country = country;
        this.jerseyNumber = jerseyNumber;

        players[total] = this;
        total++;
    }

    public static void info() {
        System.out.println("Total number of players: " + total);
        System.out.print("Players enlisted so far: ");
        for (int i = 0; i < Player.total; i++) {
            if (i == Player.total - 1) {
                System.out.print(players[i].name);
            } else {
                System.out.print(players[i].name + ", ");
            }
        }
        System.out.println();
    }

    public String player_detail() {
        return "Player Name: " + name + "\nJersey Number: " + jerseyNumber + "\nCountry: " + country;
    }
}
