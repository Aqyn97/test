package examples;

public class monster {
    int eyes;
    int hands;
    int legs;

    monster(int eyes, int hands , int legs){
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }
    monster(int num){
        this(num , num, num);
    }
    monster(){
        this(20);
    }

    String  voice(){
        return "grrr";
    }
    void voice(int num){
        for(int i = 0 ; i < num; i++){
            System.out.println("grrrr");
        }
    }
    void voice(int num , String name) {
        for(int i = 0 ; i <num ; i++){
            System.out.println(name);
        }
    }





}
