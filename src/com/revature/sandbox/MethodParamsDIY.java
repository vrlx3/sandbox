package com.revature.sandbox;

public class MethodParamsDIY {
	public static void main(String[] args) {
		// Instantiation
		MethodParamsDIY mpDIY = new MethodParamsDIY();

		// Calling 1st Method
		float[] floatArr = mpDIY.square(1, 2, 3, 4);
		for (float f : floatArr) {
			System.out.println(f);
		}

		// Calling 2nd Method
		String first = mpDIY.findFirstWord("first", "second");
		System.out.println(first);

	}
	// Create a method that declares four int parameters, squares each, and places
	// the results in a float array. The method should return the float array
	// result. Name the method square.

	public float[] square(int num1, int num2, int num3, int num4) {
		float[] input = { num1, num2, num3, num4 };
		float[] floatArr = new float[4];

		for (int i = 0; i < 4; i++) {
			floatArr[i] = (float) Math.pow(input[i], 2);
		}
		return floatArr;
	}

	// Create a method that declares two String parameters. This method should
	// search through each parameter and determine the word that should come first
	// if they were sorted alphabetically. Whichever word is first from both
	// parameters should be returned. Name the method findFirstWord.

	// You can assume that both inputs are the same length and are actual words (not
	// numbers). You can also assume that the length of each word will be at least 3
	// letters.

	public String findFirstWord(String s1, String s2) {

		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();

		for (int i = 0; i < Math.min(s1Arr.length, s2Arr.length); i++) {
			if (s1Arr[i] < s2Arr[i]) {
				return s1;
			}

			if (s1Arr[i] > s2Arr[i]) {
				return s2;
			}

		}
		return null;
	}
}
