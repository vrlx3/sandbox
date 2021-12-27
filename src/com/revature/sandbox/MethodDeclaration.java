package com.revature.sandbox;

public class MethodDeclaration {

	public static void main(String[] args) {

		// create a class instance
		MethodDeclaration md = new MethodDeclaration();

		// call your first method here
		md.talk();

		int value = 150;
		int sameValue = md.getInt(value);

		System.out.println(sameValue);
		
		System.out.println(md.sum(1,2,2.9));

	}

	// create your first method here
	public void talk() {
		System.out.println("Inside of talk method");
	}

	public int getInt(int input) {
		return input;
	}

	public double sum(int x, int y, double z) {
		return x + y + z;

	}
}
