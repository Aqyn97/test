package inheritance;

public class Square extends Shape{

    Square(int a , int b){
        super(a , b);
    }

    @Override
    public void getPr(){
        System.out.println(2 * (a  + b));
    }


}
