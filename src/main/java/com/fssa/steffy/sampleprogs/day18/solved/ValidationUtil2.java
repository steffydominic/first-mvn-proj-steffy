package com.fssa.steffy.sampleprogs.day18.solved;

public class ValidationUtil2 {
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age <= 0) {// Check if the age is a positive value
			throw new IllegalArgumentException("Invalid age");

		} else {
			return true;
		}
	}
}