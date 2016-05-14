package com.javatutorials;

import java.util.*;

public class StringLister {
	String[] names = {"Spanky", "Alfalfa", "Buckwheat", "Daria",
			"Stymie", "Marianne", "Scotty", "Tommy","Chubby"};
	
	public StringLister(String[] moreNames){
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < names.length; i++){
			list.add(names[i]);
		}
		
	}
	public static void main(String[] args) {
		

	}

}
