package inheritance;

public class Cat extends CatFam{

    Cat(){
        super(4 , 2  ,false);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("Whks");

    }



}
