package test;

public class collections {
    public static void main(String[] args) {
            NewArrayList employees = getEmployess();
//        arlist adamdar = getAdamdar();
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        employees.add("James");
        for(int i = 0 ; i < employees.getSize(); i++){
            System.out.println(employees.getName(i));
        }
//        adamdar.add("kazam");
//        adamdar.delete(4);
//        for(int i = 0 ; i < adamdar.getInfo() ; i++){
//            System.out.println(adamdar.take(i));
//        }

//        String[] employess = getEmployess();
//        String[] newArray = new String[employess.length + 1];
//        for(int i = 0 ; i < employess.length ; i++){
//            newArray[i] = employess[i];
//        }
//        newArray[newArray.length - 1] = "Man6";
//        employess = newArray;
//
//        employess[0] = null;
//        String[] newestArray = new String[employess.length - 1];
//        for(int i = 0 , j = 0 ; i < employess.length ; i++){
//            if(employess[i] != null){
//                newestArray[j] = employess[i];
//                j++;
//            }
//        }
//        employess = newestArray;
//
//        for(String man:employess){
//            System.out.println(man);
//        }

 }
    private static NewArrayList getEmployess(){
        NewArrayList employees = new NewArrayList();
         employees.add("Man1");
         employees.add("Man2");
         employees.add("Man3");
         employees.add("Man4");
         employees.add("Man5");
         return employees;

    }


//    private static arlist getAdamdar(){
//        arlist adamdar = new arlist();
//        adamdar.add("1");
//        adamdar.add("2");
//        adamdar.add("3");
//        adamdar.add("4");
//        adamdar.add("5");
//        adamdar.add("6");
//        return adamdar;
//    }


}
