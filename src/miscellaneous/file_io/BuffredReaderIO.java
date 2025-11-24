package miscellaneous.file_io;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class BuffredReaderIO {
    public static void main(String[] args) {
        String filepath="D:/Importatnt Files/RBAC.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filepath))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(" "+line);
            }
        }catch(IOException IO){
            System.err.println("IO Exception Occurred!"+IO.getMessage());
        }catch (Exception e){
            System.err.println("Unexpected Error Occurred!");
        }
    }
}
