package Interfaces;

public class Dog extends Animal implements AbleToRun{

    public void eat(){
        System.out.println("dog eating");
    }
    public void run(){
        System.out.println("dog running");
    }

}
