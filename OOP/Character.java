package OOP;

public class Character {
    final String name;
    private int health;
    int attackPower;
    private boolean isAlive;
    Character(int health, String name, int attackPower) {
        this.health = health;
        this.name = name;
        this.attackPower = attackPower;
        this.isAlive = true;
    }
    void attack(Character target) {
        System.out.println(this.name + " is attacking " + target.name);
        target.health -= this.attackPower;
        if (target.health <= 0) {
            target.isAlive = false;
            System.out.println(target.name + " has 0 health left");
            System.out.println(target.name + " is in hell");
        } else {
            System.out.println(target.name + " has " + target.health + " health left");
        }
        
    }

    int getHealth() {
        return this.health;
    }
}
