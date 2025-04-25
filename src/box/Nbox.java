package box;

public class Nbox extends Box {
    private int weight = 10;


    public Nbox(int height, int width, int length, int weight) {
        super(height, width, length);
        this.weight = weight;
    }

    public Nbox(int size, int weight) {
        super(size, size, size);
        this.weight = weight;
    }

    public Nbox() {
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("weight " + weight);
    }


}
