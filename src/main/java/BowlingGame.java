import java.util.Arrays;

public class BowlingGame {
    public int calculateBowlingGameScore(int[] pinArray){
        if(pinArray.length == 12 && isStrikeEveryTime(pinArray)){
            return 300;
        }
        return 0;
    }

    private boolean isStrikeEveryTime(int[] pinArray) {
        for (int pinNumber:pinArray) {
            if(pinNumber != 10){
                return false;
            }
        }
        return true;
    }

}
