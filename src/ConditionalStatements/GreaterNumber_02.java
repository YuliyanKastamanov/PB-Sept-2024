package ConditionalStatements;

import java.util.Scanner;

public class GreaterNumber_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //read 2 integers
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number1 > number2) {
            System.out.println(number1);
        }else {
            System.out.println(number2);
        }


    }
}
