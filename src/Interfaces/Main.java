package Interfaces;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        Fish fish = new Fish();

//
//        Animal animal = new Dog();// it calls upcast
//        animal.eat();

        //but if we will create a new void for examle run() it will give mistake
//        animal.run();
        //so we will use downcast

//        Dog dog = (Dog) animal;
//        dog.run();


        //Upcasting: Upcasting is the typecasting of a child object to a parent object. Upcasting can be done implicitly.
        // Upcasting gives us the flexibility to access the parent class members but it is not possible to access all the child class members using this feature.
        // Instead of all the members, we can access some specified members of the child class.
        // For instance, we can access the overridden methods.

        //Downcasting: Similarly, downcasting means the typecasting of a parent object to a child object.
        // Downcasting cannot be implicit.


//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(dog);
//        animals.add(cat);
//        animals.add(fish);
//        for(Animal animal : animals){
//            animal.run();
//        }//here we will try to use interface

//        ArrayList<AbleToRun> animal1 = new ArrayList<>();
//        animal1.add(dog);
//        animal1.add(cat);
//        for(AbleToRun one : animal1){
//            one.run();
//        }

        Person1 bir = new Person1();
        Person2 eki = new Person2();
        Person3 ush = new Person3();

        ArrayList<Worker> workers = new ArrayList<>();
        ArrayList<Driver> drivers = new ArrayList<>();
        workers.add(bir);
        workers.add(eki);
        workers.add(ush);
        drivers.add(eki);
        drivers.add(ush);
        for(Worker worker : workers){
            worker.work();
        }
        for(Driver driver : drivers){
            driver.drive();
        }






    }
}
