import java.util.Arrays;

public class BowlingGame {
    public int calculateBowlingGameScore(int[] pinArray) {
        int[] tenthRoundStartIndexAndPreviousNineRoundsScore = getTenthRoundStartIndexAndPreviousNineRoundsScore(pinArray);
        int tenthRoundStartIndex = tenthRoundStartIndexAndPreviousNineRoundsScore[0];
        int previousNineRoundsScore = tenthRoundStartIndexAndPreviousNineRoundsScore[1];
        int result = previousNineRoundsScore;
        if(pinArray[tenthRoundStartIndex] == 10){
            result += 10;
        }
        result += getlastRoundScore(pinArray, tenthRoundStartIndex);
        return result;
    }

    private Integer getlastRoundScore(int[] pinArray, int tenthRoundStartIndex) {
        int leftPinArraySize = pinArray.length-tenthRoundStartIndex-1;
        switch (leftPinArraySize){
            case 1:
                return pinArray[tenthRoundStartIndex+1];
            case 2:
                return pinArray[tenthRoundStartIndex+1] + pinArray[tenthRoundStartIndex+2];
            case 3:
                return pinArray[tenthRoundStartIndex+2] + pinArray[tenthRoundStartIndex+3];
        }
        return 0;
    }

    private int[] getTenthRoundStartIndexAndPreviousNineRoundsScore(int[] pinArray) {
        int[] tenthRoundStartIndexAndPreviousNineRoundsScore = new int[2];
        int gameRound = 1;
        int previousNineRoundsScore = 0;
        int tenthRoundStartIndex = 0;
        for (int i = 0; i < pinArray.length && gameRound<10; i++) {
                if(pinArray[i]<10 && pinArray[i+1]<10){
                    previousNineRoundsScore += pinArray[i] + pinArray[i+1];
                    i++;
                }else if(pinArray[i]==10){
                    previousNineRoundsScore +=10 + pinArray[i+1] + pinArray[i+2];
                }else if(pinArray[i]<10 && pinArray[i+1]==10){
                    previousNineRoundsScore += pinArray[i+1] + pinArray[i+2];
                    i += 2;
                }
                gameRound ++;
                tenthRoundStartIndex = i + 1;
        }
        tenthRoundStartIndexAndPreviousNineRoundsScore[0] = tenthRoundStartIndex;
        tenthRoundStartIndexAndPreviousNineRoundsScore[1] = previousNineRoundsScore;
        return tenthRoundStartIndexAndPreviousNineRoundsScore;
    }

}
