package Execptions;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        }catch (Exception e) {
            System.out.println("an error occurred "+ e.getMessage());
        }
    }
}
