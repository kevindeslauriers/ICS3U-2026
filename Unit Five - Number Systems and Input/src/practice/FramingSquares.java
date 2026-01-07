package practice;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FramingSquares {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("data.in"));

        while (in.hasNext()) {
            int M = in.nextInt();
            int N = in.nextInt();
            int P = in.nextInt();
            int Q = in.nextInt();

            for (int i = 0; i < Q; i++) {
                for (int j = 0; j < 2 * Q + 2 * P + N; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            for (int i = 0; i < P; i++) {
                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }
                for (int j = 0; j < N + 2 * P; j++) {
                    System.out.print("+");
                }
                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }
                for (int j = 0; j < P; j++) {
                    System.out.print("+");
                }

                for (int j = 0; j < N; j++) {
                    System.out.print(".");
                }
                for (int j = 0; j < P; j++) {
                    System.out.print("+");
                }

                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }

                System.out.println();
            }

            for (int i = 0; i < P; i++) {
                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }
                for (int j = 0; j < N + 2 * P; j++) {
                    System.out.print("+");
                }
                for (int j = 0; j < Q; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            for (int i = 0; i < Q; i++) {
                for (int j = 0; j < 2 * Q + 2 * P + N; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println();

        }

        in.close();

    }
}
