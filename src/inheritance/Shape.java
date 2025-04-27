package inheritance;

public abstract class Shape {
    protected int a;
    protected int b;

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int  Pr() {
        return 0;
    }

    public void getPr() {
        System.out.println(Pr());
    }


    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }


}
