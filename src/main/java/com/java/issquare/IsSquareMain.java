package com.java.issquare;

public class IsSquareMain {

	public static void main(String[] args) {
		System.out.println("isSquare(100): " + isSquare(100));
		System.out.println("isSquare(25): " + isSquare(25));
		System.out.println("isSquare(71): " + isSquare(71));
		System.out.println("isSquare(114): " + isSquare(114));
		System.out.println("isSquare(144): " + isSquare(144));


	}

	// Pass an int as parameter. The method should return whether the number passed
	// is a square (like i/p-> 100, 9, 16, etc -> o/p should be true) or not.
	public static boolean isSquare(int num) {
		int sqrt = (int) Math.sqrt(num);
		if (sqrt * sqrt == num) {
			return true;
		} else {
			return false;
		}

	}
}
