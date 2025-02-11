public class String_modifier {
    
    public static String replace_substring(String original, String sub_string, String placeholder) {
        String output = "";

        for (int i = 0; i < original.length(); i++) {
            boolean is_found = false;
            if (original.charAt(i) == sub_string.charAt(0)) {
                is_found = true;
                int index = i;
                for (int j = 0; j < sub_string.length(); j++) {
                    if (original.charAt(index) != sub_string.charAt(j)) {
                        is_found = false;
                        break;
                    }
                    index++;
                }
            }
            
            if (is_found) {
                output += placeholder;
                i += sub_string.length() - 1;
            } else {
                output += original.charAt(i);
            }
        }

        return output;
    }

    public static void main(String[] args) {
        System.out.println(replace_substring("badddaddda", "ddd", "n"));
    }
}
