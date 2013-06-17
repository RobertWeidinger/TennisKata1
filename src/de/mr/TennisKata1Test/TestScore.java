package de.mr.TennisKata1Test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestScore {

	@Test
	public void testIncreasePoints() {
		Score score = new Score();
		score.increasePointsA();
		score.increasePointsA();
		score.increasePointsB();
		Assert.assertEquals(30, score.getPointsA());
		Assert.assertEquals(15, score.getPointsB());
	}
}
