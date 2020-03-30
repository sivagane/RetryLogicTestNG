package org.testcases;

import java.awt.event.ItemEvent;

import org.testng.Assert;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;

public class TestCase  {

	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}
}
