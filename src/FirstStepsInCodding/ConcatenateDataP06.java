package FirstStepsInCodding;

import java.util.Scanner;

public class ConcatenateDataP06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();


        //%s -> String
        //%d -> int
        //%f -> double
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, lastName, age, town);


        //System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + town + ".");
    }
}
