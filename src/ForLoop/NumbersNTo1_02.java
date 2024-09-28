package ForLoop;

import java.util.Scanner;

public class NumbersNTo1_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = number; i > 0 ; i--) {

            System.out.println(i);

        }


    }
}
