package com.revature.sandbox;

public class MethodRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRandomNumber rn = new MethodRandomNumber();
		
		System.out.println(rn.randomNumber());
	}

	public int randomNumber() {
		double d = Math.random()*50 +1;
		return (int) d;
	}
}
