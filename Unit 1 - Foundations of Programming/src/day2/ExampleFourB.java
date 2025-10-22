package day2;

public class ExampleFourB {
    public static void main(String[] args) {
        int number = 4736;

        int digitOne = number / 1000;
        int digitTwo = number % 1000 / 100;
        // or 
        digitTwo = number / 100 % 10;
        int digitThree = number % 100 / 10;
        // or 
        digitThree = number / 10 % 10;

        int digitFour = number % 10;

        int sum = digitOne + digitTwo + digitThree + digitFour;
        System.out.println(sum);


    }
}
