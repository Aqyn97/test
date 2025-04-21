package box;

public class Nbox extends Box {
    private int weight = 10;


    public Nbox(int height, int width, int length, int weight) {
        super(height, width, length);
        this.weight = weight;
    }

    public void getWeight() {
        System.out.println(weight);
    }
}
