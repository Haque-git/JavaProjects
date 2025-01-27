package OOP;

public class Enemy extends Character {
    int rizz;
    Enemy(int health, String name, int attackPower, int rizz) {
        super(health, name, attackPower);
        this.rizz = rizz;
    }
}
