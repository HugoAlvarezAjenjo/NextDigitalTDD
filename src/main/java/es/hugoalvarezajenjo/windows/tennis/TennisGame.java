package es.hugoalvarezajenjo.windows.tennis;

import java.util.Map;

public class TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    Map<Integer, String> scoring = Map.of(
            0, "love",
            1, "fifteen",
            2, "thirty",
            3, "forty"
    );

    public String getScore() {
        if (player1Score == 3 && player2Score == 3) {
            return "deuce";
        }
        final String p1score = scoring.get(player1Score);
        final String p2score = scoring.get(player2Score);
        return p1score + "-" + p2score;
    }

    public void playerScore1() {
        this.player1Score = player1Score + 1;
    }

    public void playerScore2() {
        player2Score++;
    }
}
