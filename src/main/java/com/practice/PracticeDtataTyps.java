package com.practice;

public class PracticeDtataTyps {
	

		int x =5;
		int y=12;
		int z;
		double a = 3.14;
		double b;
		boolean c = true;
		boolean d;
		String p="Smart Tech";
		String q;
	
		public void getInt() { //not a static method 
			
	
	    System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);// default value o
		System.out.println(c);
		System.out.println(d);
		System.out.println(p);
		System.out.println(q);// default value=null
		
	
	}

		public void getLocalVariable() {
			int g=58;
			int h=20;
			System.out.println(g-h);
			
		
		
	}
	public static void main(String[] args) {
		PracticeDtataTyps obj =new PracticeDtataTyps();
		obj.getInt();
		obj.getLocalVariable();
	}
	}


