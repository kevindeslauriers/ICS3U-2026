package day1;

public class Scope {
    public static void main(String[] args) {
        {
            int x = 7;
            System.out.println(x);
        }
        int x = 9;
        System.out.println(x);
    }

    public static void mystery(){
        int x = 3;
        System.out.println();
    }
}
