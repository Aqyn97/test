package Interfaces;

public class Person2 implements Worker , Driver{
    @Override
    public void work(){
        System.out.println("Person2 working...");
    }
    @Override
    public void drive(){
        System.out.println("Person2 driving,,,");
    }

}
