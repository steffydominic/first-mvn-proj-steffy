package com.fssa.steffy.sampleprogs.projectdemo2;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fssa.steffy.sampleprogs.day20.solved.Student;

public class OrderPageValidation {

	public static boolean validate(Order order) throws IllegalArgumentException {

		if (order == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		validateDate(order.date);
		validateTime(order.time);
		validateAddress(order.address);
		validateCity(order.city);
		validatePincode(order.pincode);
		return true;

	}

	// Validate the date
	public static boolean validateDate(LocalDate date) throws IllegalArgumentException {
		// Date cannot be null
		if (date == null) {
			throw new IllegalArgumentException("Date cannot be null");
		} else {
			return true;
		}

	}

	// Validate the time
	public static boolean validateTime(LocalDateTime time) throws IllegalArgumentException {
		// Time cannot be null
		if (time == null) {
			throw new IllegalArgumentException("Date cannot be null");
		} else {
			return true;
		}

	}

	// Validate the address
	public static boolean validateAddress(String address) throws IllegalArgumentException {
		// Address cannot be empty
		if (address == null || address.trim().isEmpty()) {
			throw new IllegalArgumentException("Address cannot be empty");
		} else {
			return true;
		}

	}

	// Validate the city
	public static boolean validateCity(String city) throws IllegalArgumentException {
		// City cannot be empty
		if (city == null || city.trim().isEmpty()) {
			throw new IllegalArgumentException("City cannot be empty");
		} else {
			return true;
		}

	}

	// Validate the pincode
	public static boolean validatePincode(String pincode) throws IllegalArgumentException {

		if (pincode == null || pincode.trim().isEmpty()) {
			throw new IllegalArgumentException("Pincode cannot be empty");
		}
		// Pincode must be a 6-digit number
		if (!pincode.matches("\\d{6}")) {
			throw new IllegalArgumentException("Invalid pincode format");
		} else {
			return true;
		}
	}
	

}
