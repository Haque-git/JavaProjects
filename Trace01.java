public class Trace01 {

    public static void main(String[] args){
        int x = 0, p = 0, sum = 0;
        System.out.println("x = " + x + " p = " + p + " sum = " + sum);
        p = 1;
        System.out.println("p = " + p);
        x = 2;
        System.out.println("x = " + x);
        double q;
        sum = 0;
        System.out.println("sum = " + sum);
        while (p < 12){
             q =  x + p-(sum+7/3)/3.0%2;
             System.out.println("q = " + q);
             sum = sum + (++x) + (int)q;
             System.out.println("x = " + x + " sum = " + sum);
             System.out.println(sum++);
             System.out.println("sum = " + sum);
             if (x > 5){
                  p += 4/2;
                  System.out.println("p = " + p);
            }
             else {
                  p += 3%1;
                  System.out.println("p = " + p);
            }
        }
        sum = sum + p;
        System.out.println(sum);
      }
    
    
}