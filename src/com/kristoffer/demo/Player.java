package com.kristoffer.demo;

public class Player {

    private int score;

    public void addFivePoints() {
        score += 500;               // Does NOT conform to method logic
        setScore(score + 500);      // Checks value through if-case

    }

    // Getter
    public int getScore() {
        return score;
    }

    // Setter
    public void setScore(int score) {

        if (score >= 500) {
            System.out.println("Score is way too high");
            return;
        }

        this.score = score;
    }
}
