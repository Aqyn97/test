package Interfaces;

public class Cat extends Animal implements AbleToRun{

    public void eat(){
        System.out.println("cat eating");
    }
    public void run(){
        System.out.println("cat running");
    }
}
