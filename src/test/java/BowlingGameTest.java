import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {
    @Test
    public void shold_return_three_hundred_when_strike_every_time(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(300, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArrayNextRoundStrike = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,10};
        int[] pinArrayNextRoundSpare = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,2,10,3};
        int[] pinArrayNextRoundNoStrikeOrSpare = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,2,3};
        assertEquals(61+10+10, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundStrike));
        assertEquals(61+10+13, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundSpare));
        assertEquals(61+10+5, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundNoStrikeOrSpare));
    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,2,10,3};
        assertEquals(61+13, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_not_strike_or_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray1 = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,1,2,3};
        int[] pinArray2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(61+5, bowlingGame.calculateBowlingGameScore(pinArray1));
        assertEquals(0+0, bowlingGame.calculateBowlingGameScore(pinArray2));
    }

}
