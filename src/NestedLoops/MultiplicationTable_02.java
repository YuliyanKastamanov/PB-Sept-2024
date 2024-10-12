package NestedLoops;

import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int firstMultiplier = 1; firstMultiplier <= 10 ; firstMultiplier++) {

            for (int secondMultiplier = 1; secondMultiplier <=10 ; secondMultiplier++) {

                int result = firstMultiplier * secondMultiplier;

                System.out.printf("%d * %d = %d%n", firstMultiplier, secondMultiplier, result);

            }


        }
    }
}
