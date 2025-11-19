package day2;

public class NestedForLoops {
    public static void main(String[] args){
        int counter = 0;
        for(int i=1; i <=10; i++){
            for(int j = 1; j <= i; j++){
                counter++;      // Line 8
                System.out.println(i + " " + j + " " + counter)
            }
        }

        system.out.println(counter);
    }
}
