public class Question_11{
    public static void main(String[] arg){
        int value = 12;
        System.out.println(value);
        int another_value = 15;
        int sum = value + another_value;
        int prod = value*another_value;
        int div = value/another_value; 
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(div);
        
        double value_d = 20;
        double sum_d = value_d + value;
        double prod_d = value_d*value;
        double div_d = value_d/value;
        System.out.println(sum_d);
        System.out.println(prod_d);
        System.out.println(div_d);

        String random_string = "This is a random string";
        System.out.println(random_string);
        System.out.println(random_string + value);
        System.out.println(value + random_string);
    }
}