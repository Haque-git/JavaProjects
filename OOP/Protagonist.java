package OOP;

public class Protagonist extends Character {
    int aura;
    Protagonist(int health, String name, int attackPower, int aura) {
        super(health, name, attackPower);
        this.aura = aura;
    }
    
}
