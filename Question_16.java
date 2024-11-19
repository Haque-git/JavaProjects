public class Question_16 {
    public static final int YEAR_TO_MINTES_CONST = 365*24*60;
    public static final int DAY_TO_MINUTE_CONST = 24*60;

    public static void main(String[] args) {
        int minute = 3456789;
        int year = minute/YEAR_TO_MINTES_CONST;
        int day = (minute%(year*YEAR_TO_MINTES_CONST))/DAY_TO_MINUTE_CONST;
        System.out.println(minute + " minutes are equals to " + year + " year(s) " + day + " day(s)");
    }
}
