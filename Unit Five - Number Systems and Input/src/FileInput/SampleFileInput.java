package FileInput;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SampleFileInput {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("sample.in");
        Scanner in = new Scanner(f);

        while(in.hasNext()){
            boolean d = in.nextBoolean();
            System.out.println(d);
        }
        in.close();
    }
}