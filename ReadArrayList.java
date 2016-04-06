package com.Arraylist;
//This program has been written to display the use of iterator in array list.
import java.util.ArrayList;
import java.util.Iterator;

public class ReadArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ALSample = new ArrayList<Integer>();				// Creating an object for Arraylist.
		ALSample.add(12);													// Adding elements to the Array list.
		ALSample.add(20);
		ALSample.add(29);
		ALSample.add(49);
		
		Iterator<Integer> objIt = ALSample.iterator();					// Creating an object for iterator.
		while(objIt.hasNext())											// While loop for iterator.
		{
			System.out.print(" ");										// Print space between elements.
			System.out.print(objIt.next());								// Print Element of arraylist.
		}
		
	}
	
	
	
}