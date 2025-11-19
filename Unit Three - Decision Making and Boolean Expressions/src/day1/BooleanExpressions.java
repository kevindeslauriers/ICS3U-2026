package day1;

public class BooleanExpressions {
    public static void main(String[] args) {
        boolean isGreen = false;
        boolean canEat = true;

        boolean isEqual = 7 == 3; // 7 == 3 is false
        System.out.println(isEqual);

        boolean notEqual = 7 != 3; // ! means not in Java != not equal
        System.out.println(notEqual);

        boolean hasRedShoes = true;

        System.out.println(!hasRedShoes); // false !true
        System.out.println(!!hasRedShoes); // !!true = !false = true

        String str1 = "Hello";
        String str2 = "Goodbye";

        System.out.println(str1.equals(str2)); // false
        System.out.println(!str1.equals(str2)); // true

        // ! not only works on boolean primitives

        // > < >= <=

        System.out.println(7 >= 2); // true
        System.out.println(7 > 2); // true
        System.out.println(7 <= 2); // false
        System.out.println(7 < 2); // false
        System.out.println(2 > 2); // false

        

    }
}
