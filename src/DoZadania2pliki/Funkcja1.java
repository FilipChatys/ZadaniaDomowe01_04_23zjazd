package DoZadania2pliki;

public class Funkcja1 {
    public boolean makeGoal(int small, int big, int goal) {
        // Calculate the maximum length we can make with the given big bricks
        int maxBigLength = big * 5;

        // If the goal is less than the maximum length we can make with the big bricks,
        // we may be able to use small bricks to make up the difference
        if (goal <= maxBigLength) {
            // Calculate the remaining length we need to make up with small bricks
            int remainingLength = goal % 5;

            // Check if we have enough small bricks to make up the remaining length
            if (remainingLength <= small) {
                return true;
            }
        } else {
            // If the goal is greater than the maximum length we can make with the big bricks,
            // we will need all the big bricks we have, and possibly some small bricks
            int remainingLength = goal - maxBigLength;

            // Check if we have enough small bricks to make up the remaining length
            if (remainingLength <= small) {
                return true;
            }
        }

        // If we haven't returned true yet, we can't make the goal
        return false;
    }
}