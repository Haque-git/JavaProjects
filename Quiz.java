public class Quiz {
    public static int x, y = 0;
    public int a, b = -10;

    public Quiz(int a, int b) {
        this.a += a;
        this.b -= b;
        x += AnotherClass.x;
        y += 2;
    }

    public void methodA(int a) {
        this.a = x + a;
        this.b = this.b + this.a + this.methodB();
        System.out.println(this.a + " " + this.b + " " + x);
    }

    public int methodB() {
        this.b = x - this.x - (++AnotherClass.x);
        System.out.println(a + " " + this.b + " " + AnotherClass.x);
        x = this.b - 5;
        return this.b;
    }

    public void methodB(Quiz quiz1) {
        quiz1.y = this.y - quiz1.b + this.b;
        this.a = (quiz1.x--) + (++AnotherClass.x);
        System.out.println(this.a + " " + quiz1.y + " " + this.x);
    }
}
