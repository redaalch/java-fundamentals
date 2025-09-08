package Execptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/numbers.txt");

        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                System.out.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
