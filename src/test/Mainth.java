package test;

import java.util.*;

public class Mainth {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        names.add("Adam");
        names.add("Adam2");
        names.add("Adam3");
        names.add("Adam4");
        names.add("Adam5");

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        for(int i = 0 ; i < nums.size() ; i++){
            System.out.println(names.get(i) + " " + nums.get(i));
        }

        HashSet<String> gamers = new HashSet<>();
        gamers.add("Era");
        gamers.add("Era");
        gamers.add("Nea");
        gamers.add("TOrk");
        gamers.add("Ben");

        for(String gamer : gamers){
            System.out.println(gamer);
        }//here we can see that HashSet does not preserve the insertion order of elements

    }

}
