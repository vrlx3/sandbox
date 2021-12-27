package com.revature.sandbox;

public class MethodParams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodParams mp = new MethodParams();
		double d = mp.convertIntToDouble(5);
		System.out.println(d);
	}

	public double convertIntToDouble(int num) {
		return (double) num;
	}

}
