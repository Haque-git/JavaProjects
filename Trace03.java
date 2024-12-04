public class Trace03 {
    public static void main(String[] args) {
        int m = 17, n = 13, p = 1, sum = 30;
        System.out.println("m = " + m + " n = " + n + " p = " + p + " sum = " + sum);
        while(0 < p%10){
           if(m % 10 == 0){
              sum = sum * m % n + p / n ;
              System.out.println("sum = " + sum);
           }
           else{
              if(m % 4 == 0){
                 sum += n + (--m);
                 System.out.println("sum = " + sum + " m = " + m);
              }
              else{
                 sum -= m--;
                 System.out.println("sum = " + sum + " m = " + m);
              }
           }
           p+=1;
           System.out.println("p = " + p);
           System.out.println(sum);
        }
        System.out.println(!(n%13 == 0) && !false || p>10);
      }
        
}
