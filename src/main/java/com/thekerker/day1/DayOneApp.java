package com.thekerker.day1;

import com.thekerker.day1.services.CalibrationService;
import com.thekerker.utils.FileReader;

import java.util.List;

public class DayOneApp {
    public static void main(String[] args) {
        CalibrationService service = new CalibrationService();

        List<String> input = FileReader.readCalibrationFile("src/main/resources/day1/input1.txt");

        int sum = service.getCalibratedSum(input);

        System.out.println("Sum of calibration: " + sum);

        List<String> input2 = FileReader.readCalibrationFile("src/main/resources/day1/input2.txt");

        int sum2 = service.getCalibratedSum2(input2);

        System.out.println("Sum of new calibration: " + sum2);
    }
}
