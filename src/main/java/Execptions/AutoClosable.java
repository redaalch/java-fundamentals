package Execptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AutoClosable {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("files/numbers.txt");
        File outputFile = new File("files/output.txt");
        try(
                Scanner fileReader = new Scanner(inputFile);
                PrintWriter fileWriter = new PrintWriter(outputFile)
        ) {

            while (fileReader.hasNext()) {
                fileWriter.println(fileReader.nextDouble());
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
