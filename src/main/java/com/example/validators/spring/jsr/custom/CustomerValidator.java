package com.example.validators.spring.jsr.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.validators.spring.jsr.Customer;

/**
 * Created by krishna_hotha on 5/7/15 2015.
 */
public class CustomerValidator implements ConstraintValidator<CustomValidatorAnnotation, Customer> {
	@Override
	public void initialize(CustomValidatorAnnotation customValidatorAnnotation) {

	}

	@Override
	public boolean isValid(Customer customer, ConstraintValidatorContext constraintValidatorContext) {

		if (customer.getLastName() == null) {
			return false;
		}
		return true;
	}

}
