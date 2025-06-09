package com.example.EmployeeManagement.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class NullOrInRangeValidator implements ConstraintValidator<NullOrInRange,String> {
    private int min;
    private int max;
    private String isMandatory;
    @Override
    public void initialize(NullOrInRange parameters) {
        min = parameters.min();
        max = parameters.max();
        isMandatory = parameters.isMandatory();
    }
    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {

        if (value.length() < min || value.length() > max || value.trim().isEmpty() || value == null) {
            return !isMandatory.equalsIgnoreCase("yes");
        }
        return ValidationUtil.isValidMobileNumber(value);
    }
}
