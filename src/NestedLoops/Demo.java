package NestedLoops;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        //обикаляме сграда с подземни етажи -> -10
        for (int currentFloor = -10; currentFloor <= floors ; currentFloor++) {

            //обикаляме етажите като започваме от -10

            for (int currentRoom = 1; currentRoom <= rooms ; currentRoom++) {

                //обикаляме стаите -> започваме от стая № 1

            }
            
        }
        
        


/*
        for (int hour = 0; hour <= 23 ; hour++) {

            for (int minutes = 0; minutes <= 59 ; minutes++) {

                System.out.printf("%d:%02d%n", hour, minutes);

            }

        }*/
        
        
        
    }
}
