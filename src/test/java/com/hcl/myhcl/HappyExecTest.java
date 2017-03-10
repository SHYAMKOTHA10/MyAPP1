package com.hcl.myhcl;


import static org.junit.Assert.*;

import org.junit.Test;

public class HappyExecTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int a = 1;
		int b = 2;
		assertTrue(a + b ==3);
	}
	@Test
	public void testMavenString() {
		HappyExec he= new HappyExec();
		assertEquals(he.mavenString() , "My Maven Application");
	}

}
