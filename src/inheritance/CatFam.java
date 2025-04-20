package inheritance;

public class CatFam {
    protected int eyes;
    protected int legs;
    protected boolean canEat;

//    CatFam(){
//        eyes = 2;
//        legs = 4;
//        canEat = true;
//    }

    public CatFam(int legs, int eyes, boolean canEat) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEat = canEat;
    }
    public void eat(){
        System.out.println("Eating + ");
    }


}
