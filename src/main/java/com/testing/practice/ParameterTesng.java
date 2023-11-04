package com.testing.practice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTesng {
	@Test
	@Parameters({"myname","a"})
	public void practicParam(String myname,int a) {
		System.out.println(myname);
		System.out.println(a);
	}

}
