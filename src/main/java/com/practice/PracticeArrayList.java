package com.practice;

import java.util.ArrayList;
import java.util.List;

public class PracticeArrayList {
	


	//Formula = Interface<WrepperClass>Collectionobject = new className<>();
	//ArrayList class=> List interface
	public List<Integer> getArrayValue(){
		List<Integer>myList= new ArrayList<>();//Upcasting
		//add 2,4,4,5,8,9
		//to insert value in List,we use the add() method
		myList.add(2);
		myList.add(4);
		myList.add(4);
		myList.add(5);
		myList.add(8);
		myList.add(9);
		System.out.println(myList);
		return myList;
	}
public static void main(String[] args) {
	PracticeArrayList obj=new PracticeArrayList();
	obj.getArrayValue();
	

	//List<integer>myList=new arrayList<>();
	 
		
		
	 }}

