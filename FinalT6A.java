public class FinalT6A {

    public static int temp = 3;
  public int sum;
  public int y = 2;

  public FinalT6A(int x, int p) {
    temp += 3;
    System.out.println("[Constructor] temp changed to: " + temp);

    y = temp - p;
    System.out.println("[Constructor] y changed to: " + y);

    sum = FinalT6A.temp + x;
    System.out.println("[Constructor] sum changed to: " + sum);

    System.out.println(x + " " + y + " " + sum); // original print
  }

  public void methodA() {
    int x = 0, y = 0;

    y = y + this.y;
    System.out.println("[methodA] local y changed to: " + y);

    x = this.y + 2 + temp;
    System.out.println("[methodA] local x changed to: " + x);

    int resultB = methodB(temp, y);
    sum = x + y + resultB;
    System.out.println("[methodA] sum changed to: " + sum);

    System.out.println(x + " " + y + " " + sum); // original print
  }

  public int methodB(int temp, int n) {
    int x = 0;

    temp = ++temp;
    y = y + temp;
    System.out.println("[methodB] local temp after pre-increment: " + temp);
    System.out.println("[methodB] y changed to: " + y);

    x = x + 2 + n;
    System.out.println("[methodB] local x changed to: " + x);

    sum = sum + x + y;
    System.out.println("[methodB] sum changed to: " + sum);

    System.out.println(x + " " + y + " " + sum); // original print
    return sum;
  }
}