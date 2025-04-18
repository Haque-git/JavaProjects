package OOP;

public class Friend {
    String name;

    static int friendCount = 0;

    public Friend(String name) {
        this.name = name;
        friendCount++;
    }
}
