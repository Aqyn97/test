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
    // Benefits of @Override:
    //Compile-time check
    //Ensures you're actually overriding a method from the superclass — avoids typos
    //
    //Improves readability
    //Clearly shows the method is intended to override a parent method
    //
    //Prevents bugs
    //If the parent method signature changes, you'll get an error — helps catch mistakes early
    //
    //Supports polymorphism
    //Allows different behavior in subclasses for the same method call
    //
    //Cleaner design
    //Encourages consistent and maintainable OOP structure



}
