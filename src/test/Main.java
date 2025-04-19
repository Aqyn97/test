package test;
import examples.Person;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        box.Box box1 = new box.Box();
//        box1.width = 23;
//        box1.height = 13;
//        box1.length = 10;
//        int cool = box1.height * box1.length;
//        System.out.println(cool);
//        examples.Human man1 = new examples.Human();
//        man1.weight = 10;
//        man1.age = 11;
//        man1.name = "Yera";
//        examples.Human man2 = new examples.Human();
//        man2.weight = 20;
//        man2.age = 22;
//        man2.name = "Erosh";
//        examples.Human man3 = new examples.Human();
//        man3.weight = 30;
//        man3.age = 33;
//        man3.name = "Abzal";
//        int avg = (man1.age + man2.age + man3.age) / 3;
//        System.out.println("the average age of " + man1.name + man2.name + man3.name + " is " + avg);
//        box.Box box1= new box.Box();
//        box1.length = 2;
//        box1.width= 3;
//        box1.height = 3;
//        System.out.println(box1.getVolume());



//        examples.Dog dog1 = new examples.Dog();
//        dog1.age = 12;
//        dog1.name = "GG";
//        System.out.println(dog1.getInfo());
//        dog1.speedl = 10;
//        dog1.speed();

//        test tes1 = new test();
//        System.out.println(tes1.examples.square(45));
//
//        test tes2 = new test();
//        tes2.testbek(-23);


//        examples.square bek = new examples.square(55 , 55);
//        bek.powerbek();

//        examples.Mathbek sh = new examples.Mathbek();
//        sh.multiple(2, 12.3);


//        examples.monster mon = new examples.monster();
//        examples.monster mon2  = new examples.monster(12);
//        examples.monster mon3 = new examples.monster(23 , 23 ,12);
//
//        System.out.println(mon.voice());
//        mon2.voice(4 , "haha");
//
//        mon3.voice(5);


//        Person era = new Person(23 , "Era");
//        era.setAge(24242);
//        System.out.println(era.getAge() +"  " +  era.getName());

        String s = "This is John. He is 27 yeard old";
        String name = s.substring(8 ,12);
        String ag = s.substring(20,22);
        int age = Integer.parseInt(ag);
        System.out.println(name + " " + age);

        Person era = new Person(age , name);
        System.out.println(era.getAge()  + " " + era.getName());



    }
}