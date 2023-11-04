package com.practice;

public class PracticeReverse{
	public static void getStringrevers (String name) {
		 //System.out.println(name.length());
		 for(int i =(name.length()-1);i>=0;i--){
			 System.out.print(name.charAt(i));
			 
		 }
	 }
	
public void geRevesewithStringBuilder(String country) {
	StringBuilder sb= new  StringBuilder(country);
	System.out.print(sb.reverse());
}

	public static void main(String[] args) {

		//print united states of America
		getStringrevers("Usa");
	
		PracticeReverse obj=new PracticeReverse();
		obj.geRevesewithStringBuilder("United State of america");
	}

}
