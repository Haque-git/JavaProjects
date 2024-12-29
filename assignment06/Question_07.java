package assignment06;

public class Question_07 {
    public static void main(String[] args) {
        int[] arr = {23,100,23,56,100};
        int length_of_new_array = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            boolean is_unique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    is_unique = false;
                    break;
                }

            }    
            if (is_unique) {
                length_of_new_array++;
            }
        }
        
        
        int[] new_arr = new int[length_of_new_array];
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean is_unique = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    is_unique = false;
                    break;
                }

            }    
            if (is_unique) {
                new_arr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < new_arr.length; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}
