package NestedLoops;

import java.util.Scanner;

public class Travelling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!destination.equals("End")){
            double neededMoney = Double.parseDouble(scanner.nextLine());

            double savedMoney = 0;
            while (neededMoney > savedMoney){
                double currentMoneyToSave = Double.parseDouble(scanner.nextLine());
                savedMoney += currentMoneyToSave;
            }

            System.out.printf("Going to %s!%n", destination);


            destination = scanner.nextLine();
        }
    }
}
