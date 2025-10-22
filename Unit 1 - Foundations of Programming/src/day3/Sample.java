package day3;

public class Sample {
    public static void main(String[] args) {
        int number = 54321;
        number = number % 10;
        number = number / 10;
        int digit1 = number;
        number = number % 10;
        number = number / 10;
        int digit2 = number;
        number = number % 10;
        number = number / 10;
        int digit3 = number;
        number = number % 10;
        number = number / 10;
        int digit4 = number;
        number = number % 10;
        int digit5 = number;
        System.out.print(digit1 + digit2 + digit3 + digit4 + digit5);
    }
}
