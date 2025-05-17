package OOP.Casting;

public class CastingTester {
    public static void main(String[] args) {
        Human human = new Human();
        Dog dog = new Dog();
        Cat cat = new Cat();
        human.pets[0] = dog;
        human.pets[1] = cat;
        for (Pet pet : human.pets) {
            if(pet instanceof Cat) {
                ((Cat)pet).meow();
                return;
            }
            if(pet instanceof Dog) {
                ((Dog)pet).bark();
                return;
            }
        }
    }
}
