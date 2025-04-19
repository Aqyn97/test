package test;

import java.util.Objects;

public class NewArrayList {
    private String[] employees = new String[10];
    private int size = 0;

    public int getSize(){
        return size;
    }


    public String getName(int index){return employees[index];}
    public void add(String name){
        employees[size] = name;
        size++;
        if(employees.length == size){
            String[] adamdar = new String[employees.length * 2];
            for(int i = 0 ; i < employees.length ; i++){
                adamdar[i] = employees[i];
            }
            employees = adamdar;
        }
    }
    public void delete(int index){
        for(int i =index ; i < size - 1 ; i++){
            employees[i] = employees[i + 1];
        }
        employees[index] = null;
        size--;

    }

    public void delete(String name){
        for(int i = 0 ; i < size ; i++){
            if(Objects.equals(employees[i] , name)){
                delete(i);
                return;
            }
        }
    }






}