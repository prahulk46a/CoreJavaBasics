package Exceptions.bestpractice;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataProcessor {
//    private static final Logger logger = LoggerFactory.getLogger(DataProcessor.class);

    public void processData(String filePath) {
        try {
            Files.readString(Paths.get(filePath));
        } catch (IOException e) {
//            logger.error("Failed to read file: {}", filePath, e);
            throw new RuntimeException("Data processing failed", e);
        }
    }
}
