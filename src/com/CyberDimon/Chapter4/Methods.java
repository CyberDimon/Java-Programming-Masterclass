package com.CyberDimon.Chapter4;

public class Methods {

    public static void main(String[] args) {
        System.out.println(calculateScore(true, 5000, 5, 100));
        System.out.println(calculateScore(true, 800, 5, 200));

        displayHighScorePosition("Dima", calculateHighScorePosition(1500));
        displayHighScorePosition("Papa", calculateHighScorePosition(900));
        displayHighScorePosition("Ola", calculateHighScorePosition(400));
        displayHighScorePosition("Mama", calculateHighScorePosition(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }

    // procedure (method returning type void)
    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000) return 1;
        else if(playerScore >= 500) return 2;
        else if(playerScore >= 100) return 3;
        else return 4;
    }
}
