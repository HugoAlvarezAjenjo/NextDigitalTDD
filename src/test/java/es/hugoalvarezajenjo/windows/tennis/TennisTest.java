package es.hugoalvarezajenjo.windows.tennis;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TennisTest {
    @Test
    void shouldReturnLoveOnStart() {
        TennisGame game = new TennisGame();
        String score = game.getScore();
        assertEquals("love-love", score);
    }

    @Test
    void shouldReturnFifteenLoveOnPlayerOneScoreOne() {
        TennisGame game = new TennisGame();
        game.playerScore1();
        String score = game.getScore();
        assertEquals("fifteen-love", score);
    }
    @Test
    void shouldReturnFifteenLoveOnPlayerOneScoreTwo() {
        TennisGame game = new TennisGame();
        game.playerScore1();
        game.playerScore1();
        String score = game.getScore();
        assertEquals("thirty-love", score);
    }

    @Test
    void shouldReturnFortyLoveOnPlayerOneScoreThree() {
        TennisGame game = new TennisGame();
        game.playerScore1();
        game.playerScore1();
        game.playerScore1();
        String score = game.getScore();
        assertEquals("forty-love", score);
    }

    @Test
    void shouldReturnDeuceIfBothPlayersScoreThree() {
        TennisGame game = new TennisGame();
        game.playerScore1();
        game.playerScore1();
        game.playerScore1();
        game.playerScore2();
        game.playerScore2();
        game.playerScore2();
        String score = game.getScore();
        assertEquals("deuce", score);
    }
}
