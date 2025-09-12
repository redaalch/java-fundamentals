package Execptions;

import java.io.File;
import java.io.IOException;

public class ThrowExceptions {
    public static double calculatePay(double hours,double payRate)
            throws NegativeInputException{
        if(hours>40) {
            throw new IllegalArgumentException("hours must be less than or equal to 40");
        } else if (hours<0 || payRate<0) {
            throw new NegativeInputException();
        }
        return hours*payRate;
    }
    public static void rethrowException() throws IOException {
        File file = new File("nonexistent.txt");
        file.createNewFile();
    }
}
