package com.revature.sandbox;

public class ReturnTypesSelf {
	
	public static void main(String[] args) {
		
		ReturnTypesSelf rts = new ReturnTypesSelf();
		
		System.out.println(rts.getPi());
		
		for (char c : rts.getAlphabetArray()) {
			System.out.println(c);
		}
		
	}
	
	// getPi
	
	public double getPi() {
		return Math.PI;
	}
	
	// getAlphabetArray
	public char[] getAlphabetArray () {
		char[] alphabetArray = new char[26];
		
		char c = 'a';
		
		for (int i = 0 ; i < 26; i++) {
			alphabetArray[i] = c;
			c++;
			
		}
		return alphabetArray;
	}

}
