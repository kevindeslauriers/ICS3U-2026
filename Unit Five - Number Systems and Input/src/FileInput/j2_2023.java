package FileInput;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class j2_2023 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("j2_2023.in"));

        int N = in.nextInt();
        in.nextLine();
        int SHU = 0;

        for (int i = 0; i < N; i++) {
            String pepper = in.nextLine();
            if (pepper.equals("Poblano"))
                SHU += 1500;
            else if (pepper.equals("Mirasol"))
                SHU += 6000;
            else if (pepper.equals("Serrano"))
                SHU += 15500;
            else if (pepper.equals("Cayenne"))
                SHU += 40000;
            else if (pepper.equals("Thai"))
                SHU += 75000;
            else
                SHU += 125000;

        }

        System.out.println(SHU);
    }
}
