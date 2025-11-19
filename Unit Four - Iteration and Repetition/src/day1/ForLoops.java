package day1;

public class ForLoops {
    public static void main(String[] args) {
        // int sum = 0;
        
        String str = "Abracadabra";
        int i;
        for ( i = str.length()-1; i >= 0; i--) {
            System.out.println(str.substring(i));
        }

        // // System.out.println(sum);
        backwards("Hello");
        backwards("Hello!!!");
        // System.out.println();
        // int x = numOccureneces("banana", "an");
        // System.out.println(x);
    }

    // 1. Initialise the counter
    // 2. Check the condition
    // 3. if condition is true do the body
    // 4. Increment
    // 5. repeat 2 - 4

    public static void backwards(String str){
        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.substring(i, i+1));
        }
    }

    // accepts 2 string, return the number of times the
    // smaller string appears in the larger string.
    public static int numOccureneces(String str1, String str2){
        String big = str1;
        String small = str2;

        if (str1.length() < str2.length()){
            big = str2;
            small = str1;
        }

        int count = 0;

        for (int i = 0; i <= big.length() - small.length(); i++) {
            String s = big.substring(i, i+small.length());
            if (s.equals(small)){
                count++;
            }
        }

        return count;

    }



}
