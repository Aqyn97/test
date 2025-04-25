package box;

public class Box {
    private int height;
    private int width;
    private int length;

//    public void setDimens(int height, int width, int length) {
//        this.width = width;
//        this.length = length;
//        this.height = height;
//    }

    Box(int height, int width, int length) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    Box(int size){
        this(10  ,10 , 10 );
    }
    Box(){
        this(10);
    }

    Box copy() {
        return new Box(length, width, height);
    }

    Box increase() {
        return new Box(2 * length, 2 * width, 2 * height);
    }


    private int getVolume() {
        int volume = height + width + length;
        return volume;
    }

    public void compare(Box another) {
        int currentV = getVolume();
        int anotherV = another.getVolume();
        if (currentV > anotherV) {
            System.out.println("1st");
        } else System.out.println("2nd");
    }


}
