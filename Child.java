public class Child extends Parent {

    static int max_child = 3;
    static int no_of_child = 0;


    public Child(int age) {
        super(age);
        Child.no_of_child++;
        if (Child.no_of_child > Child.max_child) {
            throw new IllegalStateException("Max limit reached");
        }
    }

}
