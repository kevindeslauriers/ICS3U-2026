package day1;

public class CompoundBooleanExpressions {
    public static void main(String[] args) {
        boolean hasBrownHair = false;
        boolean hasWhiteShoes = true;

        System.out.println(hasBrownHair && hasWhiteShoes);  // false
        // when using && (and) both expressions must be true for the whole
        // compound expression to be true

        // || means or 

        System.out.println(hasBrownHair || hasWhiteShoes);  // true -> need one or the other

        // AND

    }
}
