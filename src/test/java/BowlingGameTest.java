import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    @Test
    public void shold_previous_nine_rounds_all_strike_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(300, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,1,10,3,10,10,10,10,10,10,10,10,10};
        assertEquals(265, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
        assertEquals(248, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_all_strike_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,1,10,2};
        assertEquals(264, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,1,10,2};
        assertEquals(4+21+13+30+30+30+30+21+21+12, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
        assertEquals(248, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_tenth_round_no_strike_or_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,1,2};
        assertEquals(246, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_tenth_round_no_strike_or_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,1,2};
        assertEquals(194, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_no_strike_or_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,1,2};
        assertEquals(194, bowlingGame.calculateBowlingGameScore(pinArray));
    }

}
