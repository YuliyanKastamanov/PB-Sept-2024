package WhileLoop;

import java.util.Scanner;

public class MinNumber_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int minValue = Integer.MAX_VALUE;
/*
        for (int i = 1; i <=1;) {
            if(command.equals("Stop")){
                break;
            }
            int currentNumber = Integer.parseInt(command);

            if(currentNumber < minValue){
                minValue = currentNumber;
            }

            command = scanner.nextLine();

        }*/

        while (!command.equals("Stop")){
            int currentNumber = Integer.parseInt(command);

            if(currentNumber < minValue){
                minValue = currentNumber;
            }

            command = scanner.nextLine();
        }

        System.out.println(minValue);
    }
}
