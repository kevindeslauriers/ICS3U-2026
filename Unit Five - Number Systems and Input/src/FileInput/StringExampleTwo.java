package FileInput;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class StringExampleTwo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("strings2.in"));
        while(in.hasNext()){
            // in.next() returns the next String up to a space or enter key
            String s = in.next();
            System.out.println(s);
        }

        in.close();
    }
}
