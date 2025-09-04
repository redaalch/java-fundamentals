package basics;

import java.util.Scanner;

public class GroosPayCalculator {
    public static void main(String[] args) {
        System.out.println("how many hours did you work");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        System.out.println("what is your hourly pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        double payRate = hours*rate;
        System.out.println("Gross pay: "+payRate);
    }
}
