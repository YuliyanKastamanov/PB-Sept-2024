package WhileLoop;

import java.util.Scanner;

public class ReadText_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();


        //докато не получи командата "Stop". -> принтираме input

        while (!input.equals("Stop")){

            System.out.println(input);

            input = scanner.nextLine();
        }


    }
}
