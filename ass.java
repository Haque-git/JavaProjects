public class ass {

    
    public static void main(String[] args) {

        int[] digits = new int[]{8,9,9,8};
 
        if(digits[digits.length-1] != 9) {
            digits[digits.length-1] += 1;
        }

        int current = 0;
        int carry = 0;
        for (int i = digits.length-1; i >= 0; i--) {
            if (i == digits.length-1) {
                current = digits[i]+1;
            } else {
                current = digits[i]+carry;
            }
            if (current > 9) {
                digits[i] = current%10;
                carry = current/10;
            }
        }
        if (carry > 0) {
            int[] modified_array = new int[digits.length+1];
            for (int i = 0; i < modified_array.length; i++) {
                if (i == 0) {
                    modified_array[i] = carry;
                } else {
                    modified_array[i] = digits[i-1];
                }
            }
        }
    }
}
