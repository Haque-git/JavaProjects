public class HWTracing02{  
    public static void main(String[] args) {
        int test = 1;
        System.out.println("test = " + test);
        int j = 0, k = 100;
        System.out.println("j = " + j + ", k = " + k);
        while (k > 0){   
            while (j < k ){
                test = k - j + 11;
                System.out.println("test = " + test);
                System.out.println(1 + test / 3 +"12");
                j+=10;
                System.out.println("j = " + j);
            }
            k-=10;
            System.out.println("k = " + k);
        }
    }
}

