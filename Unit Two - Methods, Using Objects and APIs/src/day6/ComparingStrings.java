package day6;

public class ComparingStrings {
    public static void main(String[] args) {
        // // using the equals method - checks the sequence of cvharcaters
        // String s1 = "Hello";
        // String s2 = new String("Hello");

        // System.out.println(s1.equals(s2));  //true
        // System.out.println(s1 == s2);   // false (different locations/references)

        // System.out.println(s1.compareTo(s2));   // 0

        String s3 = "goodbye";
        String s4 = "hello";
        String s5 = "alphabet";
        String s6 = "goose";

        //s5 < s3 < s6 < s4

        System.out.println(s3.compareTo(s5));
        System.out.println(s4.compareTo(s5));

        System.out.println(s3.compareTo(s6));



    }
}
