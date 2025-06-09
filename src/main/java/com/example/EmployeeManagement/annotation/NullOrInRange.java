package com.example.EmployeeManagement.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = NullOrInRangeValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface NullOrInRange {
    String message() default "Null or Blank value not allowed";
    Class<?>[] groups() default {};
    int min() default 0;
    int max() default 0;
    String isMandatory() default "yes";
    Class<? extends Payload>[] payload() default {};

}
