package inheritance;

public class Triangle extends Shape {
    private int c;

    Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public void getPr() {
        System.out.println(getA() + getB() + c);
    }

}
