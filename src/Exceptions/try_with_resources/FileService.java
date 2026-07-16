package Exceptions.try_with_resources;

import java.io.FileReader;
import java.io.IOException;

public class FileService {

    public void readFile() {
        // Try with resources. Whenever No need to close resources manually.
        try (FileReader reader = new FileReader("data.txt")) {
            System.out.println("Reading file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
