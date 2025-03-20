package examples;

public class Dog {
    double age;
    String name;
    int speedl;

    String getInfo(){
        return "the name is " + name + "and age " + age;
    }
    void speed(){
        for(int i = 0; i < speedl; i++){
            System.out.println("Бегу");
        }
    }







}
