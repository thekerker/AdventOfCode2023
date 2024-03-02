package com.thekerker.day1.services;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalibrationService {

    private final Map<Integer, String> stringVals;

    public CalibrationService() {
        stringVals = new HashMap<>();
        stringVals.put(1, "one");
        stringVals.put(2, "two");
        stringVals.put(3, "three");
        stringVals.put(4, "four");
        stringVals.put(5, "five");
        stringVals.put(6, "six");
        stringVals.put(7, "seven");
        stringVals.put(8, "eight");
        stringVals.put(9, "nine");
    }

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

    public int getCalibratedSum2(List<String> lines) {
        int sum = 0;

        for (String line : lines) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<Integer, String> entry : stringVals.entrySet()) {
                if (line.contains(entry.getValue())) {
                    sb.append(entry.getKey());
                }
            }

            String value = sb.substring(0, 1) + StringUtils.right(sb.toString(), 1);

            sum += Integer.parseInt(value);
        }

        return sum;
    }
}
