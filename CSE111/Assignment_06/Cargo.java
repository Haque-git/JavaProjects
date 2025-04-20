package CSE111.Assignment_06;

public class Cargo {
    private static double capacity = 10.0;
    private static int cargo_count = 0;
    private int ID;
    private double weight;
    private String contents;
    private boolean isLoaded;

    public Cargo(String contents, double weight) {
        this.contents = contents;
        this.weight = weight;
        this.isLoaded = false;
        Cargo.cargo_count++;
        this.ID = cargo_count;
    }

    public static double capacity() {
        return Cargo.capacity;
    }

    public void details() {
        System.out.printf("Cargo ID: %d, Contents: %s, Weight: %.1f, Loaded: %b\n", this.ID, this.contents, this.weight, this.isLoaded);
    }

    public void load() {
        if (this.isLoaded) {
            return;
        }
        if(this.weight > Cargo.capacity) {
            System.out.println("Can not laod cargo, exceeds weight capacity.");
            return;
        }
        Cargo.capacity -= this.weight;
        this.isLoaded = true;
        System.out.println("Cargo " + this.ID + " loaded for transport.");
    }

    public void unload() {
        if (!this.isLoaded) {
            return;
        }
        Cargo.capacity += this.weight;
        this.isLoaded = false;
        System.out.println("Cargo " + this.ID + " unloaded.");
    }
}


