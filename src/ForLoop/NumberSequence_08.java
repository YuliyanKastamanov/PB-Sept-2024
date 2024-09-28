package ForLoop;

import java.util.Scanner;

public class NumberSequence_08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 1; i <= countNumbers ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if(currentNumber <= minNumber){
                minNumber = currentNumber;
            }
            if(currentNumber >= maxNumber){
                maxNumber = currentNumber;
            }


        }

        System.out.println("Max number: " + maxNumber);
        System.out.println("Min number: " + minNumber);
    }
}
