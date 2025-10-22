package day6;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        String s3 = "Hello";
        String s4 = "Hello";

        // System.out.println(s1 == s2);
        // System.out.println(s1 == s3);
        // System.out.println(s3 == s4);

        // System.out.println(s1.equals(s2));  // this.methodName(parameters)
        // System.out.println(s2.equals(s4));  // true

        // System.out.println(s1.length());    // 5 characters in the string. index 0 - 4
        // largest index is always this.length()-1

        String s5 = "ell";
        String s6 = "E";

        // System.out.println(s1.indexOf(s2)); // 0
        // System.out.println(s1.indexOf(s5)); // 1
        // System.out.println(s1.indexOf(s6)); // -1

        // System.out.println("banana".indexOf("an")); // 1 <- first occurence
        // System.out.println("an".indexOf("banana")); // -1

        // System.out.println("alphabet soup".length()); // 13  indexes: 0 -> 12 
        // System.out.println("alphabet soup". substring(5, 8));

        // System.out.println(s1.substring(4, 5)); // last character

        String mystery = "Money is okay.";

        // System.out.println(mystery.substring(mystery.length()-1, mystery.length()));
        // gets the last letter

        // System.out.println("alphabet soup".substring(9));
        // System.out.println(mystery.substring(mystery.length()-1));
        System.out.println(mystery.substring(mystery.length()));    // empty string

        System.out.println(mystery.substring(mystery.length()+1));    // error



        

    }
}
