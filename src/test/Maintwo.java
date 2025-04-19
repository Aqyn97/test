package test;

import java.util.ArrayList;

public class Maintwo {
    public static void main(String[] args) {
        ArrayList<String> users = getUsers();
        for(int i = 0 ; i < users.size() ; i++){
            System.out.println(users.get(i));
        }
        System.out.println(users.iterator());

    }

    private static ArrayList<String> getUsers(){
        ArrayList<String> users = new ArrayList<>();
        users.add("Era");
        users.add("fsa");
        users.add("nn");
        return users;
    }

}
