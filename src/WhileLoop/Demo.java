package WhileLoop;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        String myPassword = "SoftUni";

        while (!password.equals(myPassword)){


            System.out.println("Please try again!");

            password = scanner.nextLine();
        }

        double neededSum = 0;

        for (int i = 1; i <= 10; i++) {
            neededSum += 100;
        }


        int a = 5;
        while (true) {

            System.out.println("a = " + a);
            a++;



        }



    }
}
