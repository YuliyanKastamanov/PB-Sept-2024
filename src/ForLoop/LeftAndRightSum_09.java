package ForLoop;

import java.util.Scanner;

public class LeftAndRightSum_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNumbers = Integer.parseInt(scanner.nextLine());

        int sumFirstColumn = 0;
        int sumSecondColumn = 0;

        for (int i = 1; i <= countNumbers * 2 ; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (i <= countNumbers){
                sumFirstColumn += currentNumber;// sumFirstColumn = sumFirstColumn + currentNumber

            }else {
                sumSecondColumn += currentNumber;
            }

        }

        int diff = Math.abs(sumFirstColumn - sumSecondColumn);

        if(diff == 0){
            System.out.printf("Yes, sum = %d", sumFirstColumn);
        }else {
            System.out.printf("No, diff = %d", diff);
        }



    }
}

