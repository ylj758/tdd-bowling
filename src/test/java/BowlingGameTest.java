import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {


//>* 2.Given Previous nine rounds:strike and spare，tenth round: strike
//    When read
//    Then return Previous nine rounds strike and spare score + new round score
//>* 3.Given Previous nine rounds:strike and spare and no strike or spare，tenth round: strike
//    When read
//    Then return Previous nine rounds strike and spare and no strike or spare score + new round score
//>* 4.Given Previous nine rounds:all strike，tenth round: spare
//    When read
//    Then return Previous nine rounds all strike score + 10 + continued one pitch score
//>* 5.Given Previous nine rounds:strike and spare，tenth round: spare
//    When read
//    Then return Previous nine rounds strike and spare score + 10 + continued one pitch score
//>* 6.Given Previous nine rounds:strike and spare and no strike or spare，tenth round: spare
//    When read
//    Then return Previous nine rounds strike and spare and no strike or spare score + 10 + continued one pitch score
//>* 7.Given Previous nine rounds:all strike，tenth round: no strike or spare
//    When read
//    Then return Previous nine rounds all strike score + tenth round first pitch score + tenth round second pitch score
//>* 8.Given Previous nine rounds:strike and spare，tenth round: no strike or spare
//    When read
//    Then return Previous nine rounds strike and spare score + tenth round first pitch score + tenth round second pitch score
//>* 9.Given Previous nine rounds:strike and spare and no strike or spare，tenth round: no strike or spare
//    When read
//    Then return Previous nine rounds strike and spare and no strike or spare score + first pitch score + tenth round first pitch score + tenth round second pitch score
//


    @Test
    public void shold_previous_nine_rounds_all_strike_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(300, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_strike(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArrayNextRoundStrike = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,10,10};
        int[] pinArrayNextRoundSpare = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,2,10,3};
        int[] pinArrayNextRoundNoStrikeOrSpare = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,10,2,3};
        assertEquals(105+10+20, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundStrike));
        assertEquals(105+10+13, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundSpare));
        assertEquals(105+10+5, bowlingGame.calculateBowlingGameScore(pinArrayNextRoundNoStrikeOrSpare));

    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,2,10,3};
        assertEquals(105+13, bowlingGame.calculateBowlingGameScore(pinArray));
    }

    @Test
    public void shold_return_ten_add_new_round_score_when_tenth_round_not_strike_or_spare(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray1 = {1,1,1,1,10,1,1,10,10,10,1,10,3,1,1,1,2,3};
        int[] pinArray2 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertEquals(105+5, bowlingGame.calculateBowlingGameScore(pinArray1));
        assertEquals(0+0, bowlingGame.calculateBowlingGameScore(pinArray2));
    }

}
