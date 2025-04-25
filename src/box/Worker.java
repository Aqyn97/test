package box;

public class Worker {
    private String  name;
    private int salary;
    private String job;

    Worker(String name, int salary , String job){
        this.job = job;
        this.salary = salary;
        this.name = name;
    }
    public void showInfo(){
        System.out.println("this is" + name + "\n salary =" + salary + "\njob - " + job);
    }





}
