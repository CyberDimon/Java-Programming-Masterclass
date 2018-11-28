package com.dima.Chapter5;

public class IfKeywordAndCodeBlocks {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5001;
        int levelCompleted = 4;
        int bonus = 100;

//	    if (score == 5000) {
//            System.out.println("Score is " + score);
//        } else {
//            System.out.println("No");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score: " + finalScore);
        }

//        int saveFinalScore = finalScore;

        //System.out.println("score: " + score);
        gameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("New final score: " + finalScore);
        }

    }
}
