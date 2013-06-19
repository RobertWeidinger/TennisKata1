package de.mr.TennisKata1Test;

import org.junit.Assert;  //Hier die org Variante
import org.junit.Test;

import de.mr.TennisKata1.Score;

public class TestScore {

     @Test
     public void testIncreasePoints() {
         Score score = new Score();

         Assert.assertEquals(0, score.getPointsA());
         score.increasePointsA();
         Assert.assertEquals(15, score.getPointsA());
         score.increasePointsA();
         Assert.assertEquals(30, score.getPointsA());
         score.increasePointsA();
         Assert.assertEquals(40, score.getPointsA());
         score.increasePointsA();
         Assert.assertEquals(40, score.getPointsA());
         score.increasePointsA();

         Assert.assertEquals(0, score.getPointsB());
         score.increasePointsB();
         Assert.assertEquals(15, score.getPointsB());
         score.increasePointsB();
         Assert.assertEquals(30, score.getPointsB());
         score.increasePointsB();
         Assert.assertEquals(40, score.getPointsB());
         score.increasePointsB();
         Assert.assertEquals(40, score.getPointsB());
         score.increasePointsB();

     }
}
