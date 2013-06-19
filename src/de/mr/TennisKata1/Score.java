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
         else if(pointsA == 30) {
             pointsA = 40;
         }
     }

     public void increasePointsB() {
         if(pointsB == 0 || pointsB == 15) {
             pointsB = pointsB + 15;
         }
         else if(pointsB == 30) {
             pointsB = 40;
         }
     }

     public int getPointsA() {
         return pointsA;
     }

     public int getPointsB() {
         return pointsB;
     }

}

