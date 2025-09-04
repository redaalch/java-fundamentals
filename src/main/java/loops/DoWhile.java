package loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;

        do {
            System.out.println("ENTER THE first number");
            double num1 = scanner.nextDouble();
            System.out.println("enter the second number");
            double num2 =scanner.nextDouble();
            System.out.println("the sum : "+(num2+num1));
            System.out.println("do you want to do it again");
            again = scanner.nextBoolean();
        }while (again);
    }
}
