package de.mr.TennisKata1Test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import de.mr.TennisKata1.Score;

public class TestRules {

	@Test
	public void testPlayerWinsBall() {
		Rules rules = new Rules();
		rules.playerAWinsBall();
		Assert.assertFalse(rules.gameOver());
		Assert.assertEquals(15, rules.getScore().getPointsA());
		Assert.assertEquals(0, rules.getScore().getPointsB());
	}

}
