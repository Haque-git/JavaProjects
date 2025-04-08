package CSE111_Practice;

public class Dog {
    String name = "musanna";
    int age;
    int bitinPower;
    String dogType = "neri";
    public Dog() {
        System.out.println("new dog has been created.");

    }
    public Dog(String name) {
        this.name = name;
        System.out.printf("a new dog named %s has been created\n", name);
    }
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.printf("a new %d years old dog named %s has been created\n",this.age,this.name);
    }

    public Dog(int age, String name) {
        this(name, age);
    }

    public Dog(int age, String name, int bitinPower) {
        this.age = age;
        this.name = name;
        this.bitinPower = bitinPower;
        System.out.printf("a new %d years old dog named %s with the power of %d has been created\n",this.age,this.name,this.bitinPower);
    }

    public void bite() {
        System.out.printf("%s is biting\n", this.name);
    }

    public void bite(Dog target) {
        if (target.dogType.equals("german")) {
            System.out.printf("%s can not bite %s because %s is %s", this.name, target.name, target.name, target.dogType);
            return;
        }
        System.out.printf("%s is biting %s\n", this.name, target.name);
    }
}