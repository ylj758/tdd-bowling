import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {
    @Test
    public void shold_return_three_hundred_when_strike_every_time(){
        BowlingGame bowlingGame = new BowlingGame();
        int[] pinArray = {10,10,10,10,10,10,10,10,10,10,10,10};
        assertEquals(300, bowlingGame.calculateBowlingGameScore(pinArray));
    }
}
