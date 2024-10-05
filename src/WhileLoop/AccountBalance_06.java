package WhileLoop;

import java.util.Scanner;

public class AccountBalance_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String command = scanner.nextLine();


        int maxValue = Integer.MIN_VALUE;

        while (!command.equals("Stop")){
            int currentNumber = Integer.parseInt(command);

            if (currentNumber > maxValue){
                maxValue = currentNumber;
            }

            command = scanner.nextLine();
        }

        /*for (int i = 1; i < 10;) {
            if(command.equals("Stop")){
                break;
            }





        }*/

        System.out.println(maxValue);
    }
}
