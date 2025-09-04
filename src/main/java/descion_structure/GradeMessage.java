package descion_structure;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("enter your letter grade");
        Scanner scanner= new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A" -> "Excellent job";
            case "B" -> "good job";
            default -> "";
        };
        System.out.println("your grade "+message);
    }
}
