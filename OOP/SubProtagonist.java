package OOP;
public class SubProtagonist extends Protagonist {
    int level;
    SubProtagonist(int health, String name, int attackPower, int aura, int level) {
        super(health, name, attackPower, aura);
        this.level = level;
    }

    
}