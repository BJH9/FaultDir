package edu.handong.csee.test;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;

import static edu.handong.csee.test.FaultDir.*;


public class TestCases {
	
	public void testAdder() {
		Assert.assertEquals(2, adder(1, 2));
		Assert.assertEquals(3, adder(1,2));
 }
	public void testSubtractor() {
		Assert.assertEquals(4, subtractor(6, 2));
		Assert.assertEquals(1, subtractor(6, 5));
		Assert.assertEquals(8, subtractor(20, 12));
	}
}