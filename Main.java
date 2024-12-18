
class Main {
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("x = " + x + ", y = " + y);
        String sum = "0";
        System.out.println("sum = " + sum);
        double p;
        while (x < 9) {
            y = x / 2;
            System.out.println("y = " + y);
            while (y < x) {
                p = (x + 5.0) / 2;
                System.out.println("p = " + p);
                sum = (sum + 2) + x + "y * 2" + (int) p;
                System.out.println("sum = " + sum);
                System.out.println(sum);
                y = y + 1;
                System.out.println("y = " + y);
            }
            x = x + 2;
            System.out.println("x = " + x);
            if (x > 5) {
                sum = "2";
                System.out.println("sum = " + sum);
            } else {
                sum += "3";
                System.out.println("sum = " + sum);
            }
        }
    }

}
