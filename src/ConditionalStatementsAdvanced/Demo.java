package ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());



        /*switch (day) {
            case 1, 2, 3, 4, 5 ->
                System.out.println("Working day");

            case 6, 7 ->
                System.out.println("Weekend");
            default ->
                System.out.println("Error");

        }*/

        if (day <= 5){
            System.out.println("Working Day");

            if(day == 5){
                System.out.println("It's pay day!");
            }

        }else {
            System.out.println("Weekend");
        }

        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 100 && number != 150){

        }


    }
}
