package Interfaces;

public class Person3 implements Worker , Driver{
    @Override
    public void work(){
        System.out.println("Person3 working///");
    }
    @Override
    public void drive(){
        System.out.println("Person3 driving,,,");
    }
}
