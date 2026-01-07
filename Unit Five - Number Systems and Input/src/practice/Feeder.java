package practice;

public class Feeder {
    private int currentFood;

    public void simulateOneDay(int numBirds) {
        Boolean normal = Math.random() < 0.95;
        if (!normal)
            currentFood = 0;
        else {
            int eachBird = ((int) Math.random() * 41) + 10;
            int eaten = eachBird * numBirds;
            currentFood -= eaten;
            if (currentFood < 0)
                currentFood = 0;
        }
    }

    public int simulateManyDays(int numBirds, int numDays){
        int result = 0;

        for (int i = 0; currentFood>0 && i < numDays; i++) {
            simulateOneDay(numBirds);
            result++;
        }

        return result;
    }
}
