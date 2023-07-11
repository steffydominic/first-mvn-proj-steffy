package com.fssa.sa.sampleprogs.projectdemo2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import com.fssa.steffy.sampleprogs.day20.solved.StudentValidator;

import com.fssa.steffy.sampleprogs.projectdemo2.Order;

//import com.fssa.steffy.sampleprogs.projectdemo2.OrderPageValidation;

import com.fssa.steffy.sampleprogs.projectdemo2.OrderPageValidation;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderPageValidationTest {
	@Test
	public void testValidate() {
		Order order = getOrder();

		Assertions.assertTrue(OrderPageValidation.validate(order));
	}

	public void testValidateDate() {
		Order order = getOrder();
		try {
			order.setDate(LocalDate.parse("2023-09-03"));
			OrderPageValidation.validateDate(order.getDate());
		} catch (IllegalArgumentException ex) {
			Assertions.fail("Unexpected IllegalArgumentException");

		}
	}

	@Test
	public void validateTime() {
		Order order = getOrder();

		try {
			LocalDateTime time = LocalDateTime.of(2023, 7, 3, 12, 30);
			order.setTime(time);
			Assertions.assertTrue(OrderPageValidation.validateTime(order.getTime()));
		} catch (IllegalArgumentException ex) {
			Assertions.fail("Unexpected IllegalArgumentException");
		}

	}

	@Test
	public void validateAddress() {
		Order order = getOrder();

		try {
			order.setAddress("123 Main Street");
			Assertions.assertTrue(OrderPageValidation.validateAddress(order.getAddress()));
		} catch (IllegalArgumentException ex) {
			Assertions.fail("Unexpected IllegalArgumentException");
		}
	}

	@Test
	public void validateCity() {
		Order order = getOrder();

		try {
			order.setCity("Delhi");
			Assertions.assertTrue(OrderPageValidation.validateCity(order.getCity()));
		} catch (IllegalArgumentException ex) {
			Assertions.fail("Unexpected IllegalArgumentException");
		}
	}

	@Test
	public void validatePincode() {
		Order order = getOrder();

		try {
			order.setPincode("627357");
			Assertions.assertTrue(OrderPageValidation.validatePincode(order.getPincode()));
		} catch (IllegalArgumentException ex) {
			Assertions.fail("Unexpected IllegalArgumentException");
		}
	}

	public Order getOrder() {
		Order order = new Order();
		order.setDate(LocalDate.of(2023, 7, 3));
		order.setTime(LocalDateTime.of(2023, 7, 3, 12, 30));
		order.setAddress("Apj");
		order.setCity("Apj");
		order.setPincode("Apj");

		return order;
	}
}