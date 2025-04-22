package justForTest;

public class Main {
    public static void main(String[] args) {
        String a = new String("Yes");
        String b = new String("Yes");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        String c = "Yes";
        System.out.println(a == c);
        Integer j = 200;
        Integer k = 200;
        System.out.println(j == k);
    }
}
