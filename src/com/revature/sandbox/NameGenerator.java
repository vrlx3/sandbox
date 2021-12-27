package com.revature.sandbox;

public class NameGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Possible Names");
		
		String[] first = {"Adam", "Alexis", "Dennis", "Jose", "Jessica", "Meghan", "Nicky", "Sarah", "William"};
		String[] last = {"Adamson", "Bond", "Brown", "Johnson", "Gallagher", "Smith", "Thompson", "Perez", "Snow", "Tran"};
		
		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < last.length; j++) {
				System.out.println(first[i] + " " + last[j]);
			}
		}
		
	}

}
