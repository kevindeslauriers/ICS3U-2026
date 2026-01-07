package day1;

public class Die {
    private int face;
    private int numFaces;

    public Die(){
        // this(6);
        numFaces = 6;
        this.roll();

    }

    public Die(int numSides){
        numFaces = numSides;
        roll();
    }

    public void roll(){
        face = (int)(Math.random()*numFaces) + 1;
    }

    public int getFace(){
        return face;
    }

    public String toString(){
        return "" + face + " on a " + numFaces + " sided die.";
    }

    public int compareTo(Die other){
        return this.face - other.face;
    }
}
