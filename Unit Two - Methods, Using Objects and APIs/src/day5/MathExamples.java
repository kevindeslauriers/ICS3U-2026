package day5;

public class MathExamples {
    public static void main(String[] args) {
        // Math m = new Math();  Cannot construct a Math object - constructor is not visible
        // EVERYTHING in the Math class is static and belongs to the class.

        System.out.println(Math.PI);

        // System.out.println(Math.abs(-7));
        // System.out.println(Math.abs(-9.4));

        // double temp = -11.3;
        // double posTemp = Math.abs(temp);


        // System.out.println(Math.sqrt(2));
        // System.out.println(Math.sqrt(3));

        // System.out.println(Math.pow(5, 3));
        // System.out.println(Math.pow(2, 0.5));

        int x1 = -1, x2 = 3;
        int y1 = 3, y2 = 7;

        
        System.out.println(Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));


    }
}
