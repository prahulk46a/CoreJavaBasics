package miscellaneous.file_io;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[]args){
        String filePath = "D:/Java Projects/HRMS/Test2.txt";
        try(BufferedReader bf= new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(" "+line);
            }

        }catch(IOException e){
            System.err.println("I/O operation failed. Root cause: " + e.getMessage());
            e.printStackTrace();
        }
        catch(Exception e){
            System.err.println("Unexpected Exception Occurred: " + e.getMessage());
        }
    }

}
