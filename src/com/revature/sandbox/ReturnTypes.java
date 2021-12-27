package com.revature.sandbox;

public class ReturnTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypes rt = new ReturnTypes();
		rt.returnVoid();

		
		System.out.println("Value of boolean is " + rt.returnBoolean());
	}
	public void returnVoid () {
		System.out.println("inside void");
	}
	public boolean returnBoolean () {
	
		return true;
		
	}
}
