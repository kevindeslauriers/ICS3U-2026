package review;

public class ReviewQuestions {
    public static String frontAgain(String str) {
        String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);

        return "" + firstTwo.equals(lastTwo);
    }

    public static String withoutEnds(String str) {
        return str.substring(1,str.length()-1);
    }

    public static String middleThree(String str){
        int middle = str.length() / 2;
        return str.substring(middle-1, middle+2);
    }

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(withoutEnds("edited"));
        System.out.println(middleThree("edited"));
    }
}
