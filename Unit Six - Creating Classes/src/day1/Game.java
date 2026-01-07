package day1;

public class Game {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die(10);
        die3.roll();
        

        int score1 = 0;
        int score2 = 0;
        int ties = 0;

        for (int i = 0; i < 1000; i++) {
            die1.roll();
            die2.roll();

            // if (die1.getFace() > die2.getFace())
            //     score1++;
            // else if (die1.getFace() < die2.getFace())
            //     score2++;
            // else
            //     ties++;

            if (die1.compareTo(die2)>0)
                score1++;
            else if (die1.compareTo(die2)<0)
                score2++;
            else
                ties++;


        }

        System.out.println(score1);
        System.out.println(score2);
        System.out.println(ties);


    }
}
