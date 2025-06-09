package com.example.employeeManagement.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;


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
        System.out.println("minimum length :"+min);
        System.out.println("maximum length :"+max);

        if (StringUtils.isNotEmpty(value)) {
            if (value.length() < min || value.length() > max || value == null || value.trim().isEmpty()) {
                return !isMandatory.equalsIgnoreCase("yes");
            }
        }

        return ValidationUtil.isValidMobileNumber(value);
    }
}
