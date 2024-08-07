package com.thekerker.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Slf4j
public class FileReader {
    public static List<String> readCalibrationFile(String fileLocation) {
        List<String> lines = new ArrayList<>();

        Path path = Paths.get(fileLocation);
        try (Scanner scanner = new Scanner(path, StandardCharsets.UTF_8)) {
            while (scanner.hasNext()) {
                lines.add(scanner.next());
            }
        } catch (IOException e) {
            log.error("Unable to read input file at " + fileLocation + ": " + e.getMessage());
        }

        return lines;
    }
}
