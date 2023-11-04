package com.practice;

public class PracticeCondition {
	
	public void getcondition (String name)  {
		
		if(name.contains("Ash")) {
			System.out.println("Match found");
		}
		
		else {
			System.out.println("no match found");
		}}
	
		public void getcondition( int a ){
			
		if (a>=18)	{
			System.out.println("Adult");
			
		}
		else {
			System.out.println("Minor");
		}
		
	}
	public static void main(String[] args) {
		PracticeCondition obj=new PracticeCondition();
		obj.getcondition("Ashraful");
				obj.getcondition("ullah");
				obj.getcondition(5);
		
	}
	

}
