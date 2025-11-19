package day2;

public class EquivilentExpressions {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        
        if(x>7){
            if (y>2)
                System.out.println("hi");
        }

        // equivilent expression
        if ((x>7) && (x >3))
            System.out.println("hi");
    }
}
