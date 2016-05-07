package com.javatutorials;

public class Virus {
	//private restricts the var to the class itself
	//protected allows a subclass and classes in the same package to change the var
	private int newSeconds = 86;
	public String author = "Sam Snett";
	int maxFileSize = 30000;
	//This creates a class var which is the same for every instance of the class
	static int virusCount = 0;
	
	public Virus (){
		virusCount++;
	}
	
	public void printCount(){
		System.out.println(virusCount);
	}
	
	public boolean infectFile(String filename){
		boolean success = false;
		//blablabla.. code goes here
		return success;
	}
	public static void main(String[] args){
		//Tests theory of automatically increasing virus count in the constructor
		Virus flu = new Virus();
		Virus HIV = new Virus();
		HIV.printCount();
	}
}
