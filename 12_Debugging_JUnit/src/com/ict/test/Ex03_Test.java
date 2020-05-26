package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;
import com.ict.junit.Ex03;

public class Ex03_Test {
	Ex02 e2 ;
	Ex03 e3 ;
	
	@Before
	public void testBefore() {
		e2 = new Ex02();
		e3 = new Ex03();
	}
	
	@Test
	public void test1() {
	    int res = e2.mul(2, 7);
	    assertEquals(14, res);
	}
	@Test
	public void test2() {
	    int res = e3.div(7, 2);
	    assertEquals(2, res);
	}
	@After
	public void testAfter() {
		
	}

}
