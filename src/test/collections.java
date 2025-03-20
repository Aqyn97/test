package test;

public class collections {
    public static void main(String[] args) {
        String[] employess = getEmployess();
        String[] newArray = new String[employess.length + 1];
        for(int i = 0 ; i < employess.length ; i++){
            newArray[i] = employess[i];
        }
        newArray[newArray.length - 1] = "Man6";
        employess = newArray;

        employess[0] = null;
        String[] newestArray = new String[employess.length - 1];
        for(int i = 0 , j = 0 ; i < employess.length ; i++){
            if(employess[i] != null){
                newestArray[j] = employess[i];
                j++;
            }
        }
        employess = newestArray;

        for(String man:employess){
            System.out.println(man);
        }

    }
    private static String[] getEmployess(){
        String[] employess = new String[5];
        employess[0] = "Man";
        employess[1] = "Man2";
        employess[2] = "Man3";
        employess[3] = "Man4";
        employess[4] = "Man5";
        return employess;
    }

}
