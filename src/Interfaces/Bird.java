package Interfaces;

public class Bird extends Animal implements AbleToRun, AbleToFly{

    public void eat(){
        System.out.println("bird eating");
    }
    public void fly(){
        System.out.println("bird flyingggg");
    }
    public void run(){
        System.out.println("bird runninggg");
    }
}
