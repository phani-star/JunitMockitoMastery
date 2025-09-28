package com.testing.codeCoverage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileService {
    public String readLastLine(Path path) throws IOException {
        var lines = Files.readAllLines(path);
        return lines.get(lines.size() - 1);
    }
}
