package de.mr.TennisKata1;

public class Score {
    private int pointsA;
    private int pointsB;

    public Score() {
        pointsA = 0;
        pointsB = 0;
    }

    public void increasePointsA() {
        if(pointsA == 0 || pointsA == 15) {
            pointsA = pointsA + 15;
        }
    }

    public void increasePointsB() {
        if(pointsB == 0 || pointsB == 15) {
            pointsB = pointsB + 15;
        }
    }

    public int getPointsA() {
        return pointsA;
    }

    public int getPointsB() {
        return pointsB;
    }

}

