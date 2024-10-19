package ExamPrep;

import java.util.Scanner;

public class FamilyTrip_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


/*
•	Бюджетът, с който разполагат – реално число в интервала [1.00 … 10000.00]
•	Брой нощувки – цяло число в интервала [0 … 1000]
•	Цена за нощувка – реално число в интервала [1.00 … 500.00]
•	Процент за допълнителни разходи – цяло число в интервала [0 … 100]
*/

        double budget = Double.parseDouble(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExpenses = Integer.parseInt(scanner.nextLine());

        //проверяваме дали имаме отстъпка при повече от 7 нощувки
        if(countNights > 7){
            pricePerNight *= 0.95;//pricePerNight - pricePerNight * 0.05
        }

        //пресмятаме цялата сума за всички нощувки
        double priceForAllNights = countNights * pricePerNight;

        //пресмятаме допълнителните разходи
        double priceExpenses = budget * percentExpenses / 100;

        //намираме общата сума за почивката
        double totalPrice = priceForAllNights + priceExpenses;

        //намираме разликата между бюджета и крайната сума
        double diff = Math.abs(totalPrice - budget);

        //проверяваме дали бюджетът е достатъчен
        if(budget >= totalPrice){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        }else {
            System.out.printf("%.2f leva needed.", diff);
        }


    }
}
