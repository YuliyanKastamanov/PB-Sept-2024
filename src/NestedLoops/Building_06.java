package NestedLoops;

import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for (int currentFloor = floors; currentFloor >= 1 ; currentFloor--) {


            for (int currentRoom = 0; currentRoom < rooms; currentRoom++) {

                if(currentFloor == floors){
                    System.out.printf("L%d%d ", currentFloor, currentRoom);
                } else if (currentFloor % 2 == 0) {
                    System.out.printf("O%d%d ", currentFloor, currentRoom);
                }else {
                    System.out.printf("A%d%d ", currentFloor, currentRoom);
                }

            }

            System.out.println();

        }


    }
}
