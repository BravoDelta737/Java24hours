package com.javatutorials;

public class VirusLab {
	public static void main(String[] args){
		int numViruses = Integer.parseInt(args[0]);
		if (numViruses > 0){
			Virus2[] virii = new Virus2[numViruses];
			for (int i = 0; i < numViruses; i++){
				virii[i] = new Virus2();
			}
			System.out.println("There are " + Virus2.getVirusCount() + " viruses.");
		}else{}
	}
}
