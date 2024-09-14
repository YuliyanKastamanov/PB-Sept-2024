package ConditionalStatements;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String initialPassword = "Example";
        //String b = a;
        //System.out.println(a == b);

        /*String password = scanner.nextLine();

        System.out.println(password.equals(initialPassword));*/

        //double grade = Double.parseDouble(scanner.nextLine());

        /*int number = Integer.parseInt(scanner.nextLine());

        boolean isPositive = number > 0;

        System.out.println(isPositive);*/


       /* if(grade >= 3){
            System.out.println("Passed!");
        }*/


       /* String color = scanner.nextLine();

        if (color.equals("red"))
            System.out.println("tomato");
        else
            System.out.println("banana");
        System.out.println("bye");*/

      /*  int number = Integer.parseInt(scanner.nextLine());

        if ( number % 2 == 0){
            System.out.println("even number");
        }*/

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade < 3){
            System.out.println("Try again!");
        }else if(grade < 3.50){
            System.out.printf("Your grade is: %.0f", Math.floor(grade));// 3.49 -> 3
        } else if (grade <= 3.99) {
            System.out.printf("Your grade is: %.0f", Math.ceil(grade));// 3.99 -> 4
        }
        //1. Math.floor(3.99) -> надолу -> 3
        //2. Math.ceil(3.99) -> нагоре -> 4
        //3. Math.abs(-100) -> Намиране на абсолютна стойност -> 100


        System.out.printf("%.0f", 5.4);


        String currentDay = "Monday";
        if (currentDay.equals("Monday")) {
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println(salary);
        }

    }
}
