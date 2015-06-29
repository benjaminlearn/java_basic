package org.benjamin.annotation.example;

import org.junit.Test;

public class FruitRun {

	@Test
	public void testGetFruitInfo(){
		FruitInfoUtil.getFruitInfo(Apple.class);
	}
}
