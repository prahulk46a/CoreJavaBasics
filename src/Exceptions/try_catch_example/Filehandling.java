package Exceptions.try_catch_example;

import java.io.FileReader;
import java.io.IOException;

// Instead of generic exception (Exception ) write proper exception
public class Filehandling {
    public void readFile() {
        try {
            FileReader reader = new FileReader("data.txt");
        } catch (IOException e) {
            System.out.println("Unable to read file.");
            e.printStackTrace();
        }
    }
}
