package com.revature.sandbox;

public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printName("Viral");
		
		printName(new String("Bhavsar"));
	}

	public static void printName(String name) {
		System.out.println("Hello " + name);
	}

}
