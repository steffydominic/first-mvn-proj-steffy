package com.fssa.sa.sampleprogs.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.steffy.sampleprogs.project.SignupValidation;
import com.fssa.steffy.sampleprogs.project.User;

public class TestSignupValidator {

	@Test
	public void testValidate() {
		User user = getUser();

		Assertions.assertTrue(SignupValidation.validate(user));
	}

	@Test
	
	public void testInvalidPassword() {
		User user = getUser();
		try {
			user.password = "a@erfg1d";
			SignupValidation.validate(getUser());
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Password must be atleast 8 charc", ex.getMessage());

		}
	}

	public User getUser() {
		User student = new User();
		student.password = "Apj";
		student.emailId = "apj@freshworks.com";
		return getUser();
	}
}
