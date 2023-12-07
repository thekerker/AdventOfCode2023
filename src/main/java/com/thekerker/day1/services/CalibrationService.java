package com.thekerker.day1.services;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CalibrationService {
    public int getCalibratedSum(List<String> lines) {
        int sum = 0;

        for (String line : lines) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (StringUtils.isNumeric(String.valueOf(c))) {
                    sb.append(c);
                }
            }

            String value = sb.substring(0, 1) + StringUtils.right(sb.toString(), 1);

            sum += Integer.parseInt(value);
        }

        return sum;
    }
}
