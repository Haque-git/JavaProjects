public class Main {
    public static void main(String[] args) {
        String str = "programming";
        String modified_str = "";
        for (int i = 0; i < str.length(); i++) {
            boolean is_unique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    is_unique = false;
                    break;
                }
            }
            if (is_unique) {
                modified_str += str.charAt(i);
            }
        }

        System.out.println(modified_str);
    }
}
