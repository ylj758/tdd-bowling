import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {



    @Test
    public void shold_previous_nine_rounds_all_strike_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(30*9+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,1,10,3,10,10,10,10,10,10,10,10,10};
        assertEquals(21+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
        assertEquals(4+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_previous_nine_rounds_all_strike_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,1,10,2};
        assertEquals(30*7+21+21+12, bowlingGame.calculateBowlingGameScore(pinArray));
    }

//>* 6.Given Previous nine rounds:strike and spare and no strike or spare，tenth round: spare
//>* 7.Given Previous nine rounds:all strike，tenth round: no strike or spare
//>* 8.Given Previous nine rounds:strike and spare，tenth round: no strike or spare
//>* 9.Given Previous nine rounds:strike and spare and no strike or spare，tenth round: no strike or spare
    @Test
    public void shold_previous_nine_rounds_strike_and_spare_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,1,10,3,10,10,10,10,10,10,1,10,2};
        assertEquals(21+21+13+30+30+30+30+21+21+12, bowlingGame.calculateBowlingGameScore(pinArray));
    }
//
//    @Test
//    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
//        BowlingGame bowlingGame = new BowlingGame();
//        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
//        assertEquals(4+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
//    }
//
//    @Test
//    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
//        BowlingGame bowlingGame = new BowlingGame();
//        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
//        assertEquals(4+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
//    }
//
//    @Test
//    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
//        BowlingGame bowlingGame = new BowlingGame();
//        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
//        assertEquals(4+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
//    }
//
//    @Test
//    public void shold_previous_nine_rounds_strike_and_spare_and_no_strike_or_spare_tenth_round_strike(){
//        BowlingGame bowlingGame = new BowlingGame();
//        int[] pinArray = {1,3,10,1,10,3,10,10,10,10,10,10,10,10,10};
//        assertEquals(4+21+13+30+30+30+30+30+30+10+10+10, bowlingGame.calculateBowlingGameScore(pinArray));
//    }

}
