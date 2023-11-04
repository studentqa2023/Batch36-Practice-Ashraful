package com.practice;

public class PracticVariables {
	//Instance variable(aka Global variable)=> inside the class but out side the method
	
	int a=10;
	int b=5;
	static int c =50;//Inst
	
	public void getVariables() {
		System.out.println(a+b);
		System.out.println(c);
		
	}
public void getlocal() {
	int e =25;//local variable
    int f =15;
	System.out.println(e-f);
	
	System.out.println(a+b);
	
}
public static void getstaticVariables() {
	System.out.println(c);

}
public static void main(String[] args) {
	PracticVariables obj = new PracticVariables ();
	obj.getVariables();
	obj.getlocal();
	getstaticVariables();
	
		
	
}
}
