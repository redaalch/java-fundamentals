package descion_structure;

import java.util.Scanner;

public class QuitaCalculator {
    public static void main(String[] args) {
        int quota=10;
        System.out.println("Enter the numbers of sales");
        Scanner scanner= new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if(sales>=quota) {
            System.out.println("Congrats ");
        } else {
            int rest = quota-sales;
            System.out.println("you did not make your quota "+ " you need "+rest+" sales");

        }
    }


}
