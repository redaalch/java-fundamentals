package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;
        System.out.println("How many hours did you work");
        Scanner scanner = new Scanner(System.in);
        int hours =scanner.nextInt();
        while (hours>maxHours || hours<0) {
            System.out.println("invalid input");
            hours = scanner.nextInt();
        }
        scanner.close();
        System.out.println("your salary is "+(hours*rate));
    }
}
