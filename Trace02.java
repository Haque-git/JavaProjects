public class Trace02 {
    public static void main(String[] args) {
        int x = 0, p = 0, sum = 0;
        System.out.println("x = " + x + " p = " + p + " sum = " + sum);
        p = 1;
        System.out.println("p = " + p);
        x = 2;
        System.out.println("x = " + x);
        double q = 0.0;
        System.out.println("q = " + q);
        sum = 5;
        System.out.println(" sum = " + sum);
        while (p < 15) {
        	q = x + p - (sum + (int) (7 / 4)) / 3.0 % 2;
            System.out.println("q = " + q);
        	sum = sum + x + (int) q;
            System.out.println("sum = " + sum);
        	x += 1;
            System.out.println("x = " + x);
        	System.out.println(sum);
        	if (x > 5) {
            	p += (int) (5 / 2);
                System.out.println("p = " + p);
        	} 
        	else {
            	p += 10 % 3;
                System.out.println("p = " + p);
        	}
        }
        sum = sum + p;
        System.out.println(sum);
    }


}
