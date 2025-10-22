package day5;

public class RandomExamples {
    public static void main(String[] args) {
        // for (int i = 0; i < 100; i++) {
        // System.out.println(Math.random());
        // }

        // Random numbers from 1 to 10 inclusive
        // for (int i = 0; i < 1000; i++) {
        // int num = (int)(Math.random() * 10) + 1;
        // System.out.println(num);
        // }

        // Random numbers from -100 to 100 inclusive
        // for (int i = 0; i < 1000; i++) {
        // int num = (int)(Math.random() * 201) + -100;
        // System.out.println(num);
        // }

        int lowerBound = 8;
        int upperBound = 12;
        for (int i = 0; i < 1000; i++) {
            int num = (int) (Math.random() * (upperBound-lowerBound+1)) + lowerBound;
            System.out.println(num);
        }

    }
}
