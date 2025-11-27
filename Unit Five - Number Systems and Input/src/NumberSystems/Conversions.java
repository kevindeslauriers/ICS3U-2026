package NumberSystems;

public class Conversions {
    public static String decimalToBase(int decimal, int base) {
        if (decimal == 0) {
            return "0";
        }

        String result = "";

        // All possible digit symbols up to base 16
        String digits = "0123456789ABCDEF";

        while (decimal > 0) {
            int remainder = decimal % base; // 0 .. base-1

            // Get the corresponding digit as a 1-character String
            String digit = digits.substring(remainder, remainder + 1);

            // Put it at the front of the String
            result = digit + result;

            decimal /= base;
        }

        return result;
    }

    // any base (2–16) -> decimal
    // assumes number only contains 0–9 and A–F (uppercase)
    public static int baseToDecimal(String number, int base) {
        String digits = "0123456789ABCDEF";
        int value = 0;

        for (int i = number.length()-1; i >= 0; i--) {
            String ch = number.substring(i, i + 1); // already uppercase
            int digit = digits.indexOf(ch); // 0..15 or -1

            value += digit * Math.pow(base,number.length()-i-1);
        }

        return value;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBase(42, 2));   // 101010
        System.out.println(decimalToBase(42, 8));   // 52
        System.out.println(decimalToBase(42, 16));  // 2A

        System.out.println(baseToDecimal("101010", 2)); // 42
        System.out.println(baseToDecimal("52", 8));     // 42
        System.out.println(baseToDecimal("2A", 16));    // 42
    }
}
