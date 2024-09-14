package FirstStepsInCodding;

import java.util.Scanner;

public class RectangleAreaP03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());

        int number2 = Integer.parseInt(scanner.nextLine());

        int area = number1 * number2;

        System.out.println(area);


    }
}
