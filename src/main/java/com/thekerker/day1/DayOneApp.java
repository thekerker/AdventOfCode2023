package com.thekerker.day1;

import com.thekerker.day1.services.CalibrationService;
import com.thekerker.utils.FileReader;

import java.util.List;

public class DayOneApp {
    public static void main(String[] args) {
        CalibrationService service = new CalibrationService();

        List<String> input = FileReader.readCalibrationFile();

        int sum = service.getCalibratedSum(input);

        System.out.println("Sum of calibration: " + sum);
    }
}
