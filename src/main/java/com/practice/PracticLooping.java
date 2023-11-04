package com.practice;



public class PracticLooping {
 public void getPositiveLoop() {
	 //postitive loop
	 //formula -start;end;++
	 //print number
	 for ( int i =0;i<=10;i++) {
	System.out.println(i); 
 }
	 
}
 // Negative for loop
 //Formula=for(end;start;;--)
 
 
 public void getnegativeLoop() {
	 for(int j = 10; j>=0;j--) {
		 System.out.println(j);
		 
	 }}
	 public void getBreak() {
		 for(int i=0;;i++) {
			 System.out.println(i);
			 if(i==8) {
				 break;
			 }
		 }
			 
		 
	 }
	 
 
 public static void main(String[] args) {
	 PracticLooping obj=new  PracticLooping();
	 obj.getPositiveLoop();
	 obj.getnegativeLoop();
	 obj.getBreak();
			 
}
 }

