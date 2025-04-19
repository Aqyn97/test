package test;

import java.util.Objects;

public class arlist {
    private String[] adamdar = new String[10];
    private int size = 0;

    public  String take(int index){
        return adamdar[index];

    }
    public int getInfo(){
        return size;
    }
    public void add(String adam){
        adamdar[size] = adam;
        size++;
        if(adamdar.length == size){
            String[] newarlist = new String[size * 2];
            for(int i = 0; i < adamdar.length ; i ++){
                newarlist[i] = adamdar[i];
            }
            adamdar = newarlist;
        }
    }
    public void delete(int index){
        for(int i = index ; i < size - 1 ; i++){
            adamdar[i] = adamdar[i + 1];
        }
        adamdar[size] = null;
        size--;
    }
    public void delete(String adam){
        for(int i = 0 ; i < size; i++){
            if(Objects.equals(adamdar[i] , adam)){
                delete(i);
                return;
            }
        }
    }



}
