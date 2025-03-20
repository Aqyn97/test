package examples;

public class Person {
    private int age;
    private String name;

    public Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    void show(){
        System.out.println("this is " + name + " and age =" + age);
    }
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }





}
