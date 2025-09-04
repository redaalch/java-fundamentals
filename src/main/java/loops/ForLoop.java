package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("enter the number of the items");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < quantity; i++) {
            System.out.println("enter the cost of the item");
            double price = scanner.nextDouble();
            total = total+price;
        }
        scanner.close();
        System.out.println("the total is "+total);
        
    }
}
