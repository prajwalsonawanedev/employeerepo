package com.example.EmployeeManagement.annotation;

import org.apache.commons.lang3.StringUtils;

public class ValidationUtil {

    private static String MOBILE_NUMBER_REGEX="^[6-9]\\\\d{9}$";
    public static boolean isBlank(final CharSequence cs) {
        return StringUtils.isBlank(cs);
    }

    public static boolean isValidMobileNumber(String value) {
        return StringUtils.isNotEmpty(value) && value.matches(MOBILE_NUMBER_REGEX);
    }
}
