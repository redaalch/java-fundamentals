package methods;

import java.util.Scanner;

public class Scope {
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();
        boolean qualified = isUserQualified(salary,creditScore);
        notifyUser(qualified);
    }

    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("you deserve a loan baby");
        } else {
            System.out.println("sorry");
        }
    }

    public static boolean isUserQualified(double salary, int creditScore) {
        return salary > requiredSalary && creditScore > requiredCreditScore;
    }

    public static int getCreditScore() {
        System.out.println("enter your score baby");
        return scanner.nextInt();
    }

    public static double getSalary() {
        System.out.println("enter your salary baby-girl");
        return scanner.nextDouble();
    }


}
