package assignment07;

public class Question_03 {
    protected static boolean isTriangle(int a, int b, int c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    protected static void triArea(int x, int y, int z) {
        if (isTriangle(x, y, z)) {
            double s = (x + y + z) / 2;
            System.out.println(Math.sqrt(s * (s - x) * (s - y) * (s - z)));
        } else {
            System.out.println("Can't form a triangle");
        }
    }

    public static void main(String[] args) {
        int l = 3, m = 4, n = 5;
        System.out.println(isTriangle(l, m, n));
        triArea(l, m, n);
    }
}
