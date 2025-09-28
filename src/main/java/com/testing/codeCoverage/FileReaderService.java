package com.testing.codeCoverage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReaderService {
    public String readFirstLine(Path path) throws IOException {
        return Files.readAllLines(path).get(0);
    }
}
