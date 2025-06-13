package com.example.employeeManagement.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.apache.commons.lang3.StringUtils;

public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, String> {
    private int min;
    private int max;
    private String isMandatory;
    private String isEmail;

    @Override
    public void initialize(NullOrNotBlank parameters) {
        min = parameters.min();
        max = parameters.max();
        isMandatory = parameters.isMandatory();
        isEmail = parameters.isEmail();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        System.out.println("inside isValid() of NullOrNotBlank");
        if (ValidationUtil.isBlank(value)) {
            return !isMandatory.equalsIgnoreCase("yes");
        }
        if (isEmail.equalsIgnoreCase("yes") && !EmailValidator.isValidEmail(value)) {
            return false;
        }
        if (min == 0 & max == 0)
            return true;

        if (StringUtils.isNotEmpty(value)) {
            int length = value.length();
            return length >= min && length <= max;
        }
        return true;

    }

}
