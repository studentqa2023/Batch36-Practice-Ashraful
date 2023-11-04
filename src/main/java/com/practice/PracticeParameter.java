package com.practice;

public class PracticeParameter {
	int x =5;
	int y =10;
			public void getnewYork() {
				System.out.println(x+y);
				
		
	}
			public void getBoston() {
				int x =30;
				int y =40;
				
						
				
				System.out.println(x+y);
				
			}
			public void getAtlanta ( int x, int y, double e, boolean r, String h) {
				System.out.println(x+y);
			}
			
		public static void main(String[] args) {
			PracticeParameter obj =new PracticeParameter	();
			obj.getnewYork();
			obj.getBoston();
			obj.getAtlanta(5, 2, 0, true, null);
		}	

}
