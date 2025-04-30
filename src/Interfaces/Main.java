package Interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        for(Animal animal : animals){
            animal.eat();
        }
    }
}
