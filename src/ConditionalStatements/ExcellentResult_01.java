package ConditionalStatements;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        if (grade >= 5){
            System.out.println("Excellent!");
            System.out.println("You passed to next stage!");
        }else {
            System.out.println("Try again!");
        }
    }
}
