package WhileLoop;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (number > sum){

            int currentNumber = Integer.parseInt(scanner.nextLine());

            sum += currentNumber;
        }

        System.out.println(sum);
    }
}
