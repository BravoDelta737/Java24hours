package com.javatutorials;

import java.util.*;

public class calculator {
	public static void main(String[] args){
	Scanner kbReader = new Scanner(System.in);
	double fnum, snum, answer;
	System.out.println("Enter first number");
	fnum = kbReader.nextDouble();
	System.out.println("Enter second number");
	snum = kbReader.nextDouble();
	System.out.println("Enter operator");
	
	switch(kbReader.next()){
	case "add":
		answer = fnum + snum;
		System.out.println(answer);
		break;
	case "subtract":
		answer = fnum - snum;
		System.out.println(answer);
		break;
	case "multiply":
		answer = fnum * snum;
		System.out.println(answer);
		break;
	case "divide":
		answer = fnum / snum;
		System.out.println(answer);
		break;
	}
	
	
	
	
	
	
	}
}
