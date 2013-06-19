package de.mr.TennisKata1Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TestScore.class,
	TestRules.class
	})
public class AllTests {

}