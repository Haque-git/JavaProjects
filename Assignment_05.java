public class Assignment_05 {

  public static void showDots(int skibidi) {
    for (int i = 1; i <= skibidi; i++) {
      System.out.print(".");
    }
  }

  public static void showPalindrom(int pookie) {
    for (int i = 1; i < pookie; i++) {
      System.out.print(i);
    }
    for (int i = pookie; i > 0; i--) {
      System.out.print(i);
    }
    
  }

  public static void showDiamond(int nigga) {
    for (int i = 1; i <= nigga; i++) {
      showDots(nigga - i);
      showPalindrom(i);
      showDots(nigga - i);
      System.out.println();
    }
    for (int i = nigga - 1; i > 0; i--) {
      showDots(nigga - i);
      showPalindrom(i);
      showDots(nigga - i);
      System.out.println();
    }
  }

  public static void main(String[] args) {
    showDots(5);
    showPalindrom(5);
    showDiamond(5);
  }
}