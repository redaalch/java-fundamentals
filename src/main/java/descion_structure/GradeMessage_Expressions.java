package descion_structure;

import java.util.Scanner;

public class GradeMessage_Expressions {
    public static void main(String[] args) {
        System.out.println("enter your letter grade");
        Scanner scanner= new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message = switch (grade) {
            case "A","X" -> "Excellent job";
            case "B" -> {
                System.out.println("print");
                yield  "good job";
            }
            default -> "Not valid";
        };
        System.out.println("your grade "+message);
    }
}
