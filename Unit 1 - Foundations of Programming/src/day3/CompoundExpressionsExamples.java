package day3;

public class CompoundExpressionsExamples {
    public static void main(String[] args) {
        // Math Operators
        // *, /, +, -, %

        int x = 7;
        int y = 3;

        // Simple Operator Expressions
        int z = x + y;
        System.out.println(z);

        z = x - y; // 2 seperator operaors, = and -
        System.out.println(z);

        z = x * y;
        System.out.println(z);

        z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);

        // Compound Operator Expressions

        int numStudents = 24;
        numStudents = numStudents - 3;
        // numStudents = 24 - 3;

        numStudents -= 3;

        // y = y + 2;
        y += 2;

        // x = x * 4;
        x *= 4;

        // other operators
        y %= 2;
        y /= 2;

        int a = 0;

        // these all do the same
        a = a + 1;
        a += 1;
        a++;

        numStudents = numStudents - 1;
        numStudents -= -1;
        numStudents--;

        
    }
}
