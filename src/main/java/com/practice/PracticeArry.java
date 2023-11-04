package com.practice;

import java.util.Arrays;

public class PracticeArry {

	int a =2;//variable >= cannot handle more than one value 
	int []b = {10,20,30,50};//single dimensional array
	int []c = {2,3,5,8};
	int []e= {45,56,34,50};
	int [][]d= {b,c};//Malti dimensional array
	
	public void getArry() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(d));
	}
	public static void main(String[] args) {
		
		PracticeArry obj =new PracticeArry();
		obj.getArry();
		
	}
}

