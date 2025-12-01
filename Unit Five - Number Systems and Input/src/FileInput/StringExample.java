package FileInput;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StringExample {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("strings.in"));
        while(in.hasNext()){
            // reads the whole line as a String to the enter key
            String s = in.nextLine();
            System.out.println(s);
        }

        in.close();
    }
}
