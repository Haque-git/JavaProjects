class flag_index_pair{
    boolean fl;
    int ind;
    public flag_index_pair(boolean flag, int index) {
        this.fl = flag;
        this.ind = index;
    }
}


public class Valid_mail {
    protected static boolean is_letter(char ch) {
        if ((int)ch >= (int)'A' && (int)ch <= (int)'Z') {
            return true;
        }
        
        if ((int)ch >= (int)'a' && (int)ch <= (int)'z') {
            return true;
        }

        return false;
    }

    protected static flag_index_pair has_char(String s, char ch) {
        boolean flag = false;
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                flag = true;
                index = i;
            }
        }
        return new flag_index_pair(flag, index);
    }

    protected static boolean valid_mail(String s) {
        if (!is_letter(s.charAt(0))){
            return false;
        }

        flag_index_pair r_index_pair_for_at = has_char(s, '@');
        flag_index_pair r_index_pair_for_dot = has_char(s, '.');
        
        if (!r_index_pair_for_at.fl && !r_index_pair_for_dot.fl) {
            return false;
        }
        if (r_index_pair_for_dot.ind < r_index_pair_for_at.ind) {
            return false;
        }
        if (r_index_pair_for_dot.ind == s.length() -1) {
            return false;
        }
        return true;
    }

    protected static int valid_mail_counter(String[] arr) {
        int count = 0;
        for (String mail: arr) {
            if (valid_mail(mail)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] email_list = {"cse110@gmail.com", "government@cv.",  "eee@bracu.ac.bd"};
        System.out.println(valid_mail_counter(email_list));
    }
}
