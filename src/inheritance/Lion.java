package inheritance;

public class Lion extends CatFam {
    public Lion() {
        super(4, 2, true);
        canEat = true;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Antilop");
    }


}
